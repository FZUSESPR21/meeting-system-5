package com.team.meetingsystem.controller;

import com.team.meetingsystem.model.*;
import com.team.meetingsystem.service.AccountService;
import com.team.meetingsystem.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/***
* @Description:
* @Param:
* @return:
* @Author: top
* @Date: 2021/3/27
*/
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    /***
    * @Description: 登陆
    * @Param:
     * name required
     * password required
    * @return: ResponseMessage
    * @Author: top
    * @Date: 2021/3/27
    */
    @PostMapping("/login")
    public ResponseMessage login(@RequestBody Account account, HttpServletRequest request) throws Exception{
        String name = account.getName();
        String pwd = MD5Util.md5Password(account.getPassword());        //密码加密

        if (name==null||pwd==null){
            return ResponseMessage.failure("请求参数不完整");
        }
        //判断数据库中是否存在该用户
        if (!accountService.checkAccountExists(name)){
            return ResponseMessage.failure("用户未注册");
        }
        else if (!accountService.checkPassword(name, pwd)){
            return ResponseMessage.failure("密码错误");
        }
        else {
            //验证成功 将用户信息添加到session中
            Account account1 = accountService.getAccountByName(name);
            HttpSession session = request.getSession();
            session.setAttribute("userName",name);
            session.setAttribute("status",account1.getStatus());      //身份

            return ResponseMessage.success("登陆成功");
        }
    }

    /*** 
    * @Description: 退出登陆 清除session中的用户信息 
    * @Param:
    * @return:  
    * @Author: top
    * @Date: 2021/3/27 
    */
    @GetMapping("/logout")
    public ResponseMessage logout(HttpServletRequest request){
        HttpSession session = request.getSession();
        if (session.getAttribute("userName")!=null){
            session.removeAttribute("userName");
            session.removeAttribute("status");
            return ResponseMessage.success("退出成功");
        }
        return  ResponseMessage.failure("请先登录");
    }

    /***
    * @Description: 注册
    * @Param:
     * name
     * password
     * status 默认应该为 普通用户
     * forumList[] 用户参加的论坛
    * @return:
    * @Author: top
    * @Date: 2021/3/27
    */
    @PostMapping("/register")
    public ResponseMessage register(@RequestBody RegisterAccount registerAccount){
        String name = registerAccount.getName();
        String pwd = MD5Util.md5Password(registerAccount.getPassword());
        List<Integer> forums = registerAccount.getForums();
        Integer status = 1;

        Account account = new Account(name,pwd,status);

        if (name==null||pwd==null){
            return ResponseMessage.failure("请求参数不完整");
        }
        if(accountService.checkAccountExists(name)){
            return ResponseMessage.failure("该用户名已注册");
        }
        else {
            //执行注册方法
            accountService.register(account);
            //添加AccountForum记录
            for (Integer forum : forums){
                accountService.insertAccountForum(new AccountForum(name, forum));
            }
            return ResponseMessage.success("注册成功");
        }
    }

    // 登录后才可用  返回用户所参与分论坛的信息
    @GetMapping("/getForumMessage")
    public ResponseMessage getForumMessage(HttpServletRequest request){
        HttpSession session = request.getSession();
        String name = session.getAttribute("userName").toString();
        if (name!=null){
            //获得account 然后获取所参与的分论坛
            List<AccountForum> accountForums = accountService.getAccountForums(name);
            //遍历列表 获取通知，添加到通知列表中
            List<Notice> notices = new ArrayList<>();
            for (AccountForum acc:accountForums){
                Integer forumid = acc.getForumId();
                notices.addAll(accountService.getNoticeByForumid(forumid));
            }
            return ResponseMessage.success(notices);
        }
        return  ResponseMessage.failure("请先登录");
    }
}
package com.team.meetingsystem.service.impl;

import com.team.meetingsystem.dao.AccountForumMapper;
import com.team.meetingsystem.dao.AccountMapper;
import com.team.meetingsystem.dao.NoticeMapper;
import com.team.meetingsystem.model.Account;
import com.team.meetingsystem.model.AccountForum;
import com.team.meetingsystem.model.Notice;
import com.team.meetingsystem.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*** 
* @Description:  
* @Param:  
* @return:  
* @Author: top
* @Date: 2021/3/27 
*/
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Autowired
    private AccountForumMapper accountForumMapper;
    @Autowired
    private NoticeMapper noticeMapper;


    @Override
    public boolean checkAccountExists(String name){
        Account account1 = accountMapper.selectByName(name);
        if (account1!=null){
            return true;
        }
        return false;
    }

    @Override
    public boolean checkPassword(String name,String password){
        Account account1 = accountMapper.selectByName(name);
        if (account1.getPassword().equals(password)){
            return true;
        }
        return false;
    }

    /*** 
    * @Description: 检查输入的用户status是是否与数据库一致 
    * @Param:
    * @return:  
    * @Author: top
    * @Date: 2021/3/27 
    */
    @Override
    public boolean checkStatus(Account account){
        Account account1 = accountMapper.selectByName(account.getName());
        if (account1.getStatus() == account.getStatus()){
            return true;
        }
        return false;
    }

    @Override
    public void register(Account account){
        accountMapper.insert(account);
    }

    //插入一条
    @Override
    public void insertAccountForum(AccountForum accountForum){
        accountForumMapper.insert(accountForum);
    }

    //根据name返回AccountForum列表
    public List<AccountForum> getAccountForums(String name){
        return accountForumMapper.selectByName(name);
    }

    //根据name获取Account
    @Override
    public Account getAccountByName(String name){
        return accountMapper.selectByName(name);
    }

    @Override
    public List<Account> getAccounts() {
        return accountMapper.selectAll();
    }

    @Override
    public List<Notice> getNoticeByForumid(Integer forumid){
        return noticeMapper.selectByID(forumid);
    }

}

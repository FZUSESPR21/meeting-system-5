package com.team.meetingsystem.controller;

import com.sun.corba.se.impl.protocol.giopmsgheaders.RequestMessage;
import com.team.meetingsystem.dao.AccountMapper;
import com.team.meetingsystem.model.ResponseMessage;
import com.team.meetingsystem.service.AccountInfoService;
import com.team.meetingsystem.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/secretary")
public class AccountInfoController {
    @Autowired
    private AccountInfoService accountInfoService;

    @GetMapping("/info")
    public ResponseMessage all(HttpServletRequest request){
        HttpSession session= request.getSession();
        Object object = session.getAttribute("userName");
        if(null==object){
            return new ResponseMessage(201, "授权已过期",object);//用户授权已经过期，设置为201
        }
        else{
            if(Integer.parseInt(session.getAttribute("status").toString())==2){
                return ResponseMessage.success(accountInfoService.selectAll());
            }
            return new ResponseMessage(202, "用户没有权限",object);
        }
    }
}

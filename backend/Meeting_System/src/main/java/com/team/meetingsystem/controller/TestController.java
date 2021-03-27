package com.team.meetingsystem.controller;

import com.team.meetingsystem.dao.AccountForumMapper;
import com.team.meetingsystem.dao.AgendaMapper;
import com.team.meetingsystem.model.AccountForum;
import com.team.meetingsystem.model.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date 2021/03/27
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private AccountForumMapper accountForumMapper;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
    @GetMapping("/all")
    public ResponseMessage all(){
        accountForumMapper.insert(new AccountForum("用户2", 1));
        System.out.println(accountForumMapper.selectByName("用户2"));
        return ResponseMessage.success("ok");
    }
}

package com.team.meetingsystem.controller;

import com.team.meetingsystem.dao.AccountMapper;
import com.team.meetingsystem.dao.AgendaMapper;
import com.team.meetingsystem.model.ResponseMessage;
import com.team.meetingsystem.service.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/homepage")
public class CountController {
    @Autowired
    private AccountMapper accountMapper;
    @Autowired
    private CountService countService;

    @GetMapping("/MeetingAccountCount")
    public ResponseMessage Count(HttpServletRequest request) {
        HttpSession session = request.getSession();
        if (session.getAttribute("userName") != null)
        {
            if(session.getAttribute("status").equals(3))
            {
                return ResponseMessage.success(countService.getMetingCount());
            }
        else if ((Integer)session.getAttribute("status")<0)
        {
            return ResponseMessage.success(countService.getForumCount(1));
        }
        }


        return ResponseMessage.failure("未登录");

    }

}
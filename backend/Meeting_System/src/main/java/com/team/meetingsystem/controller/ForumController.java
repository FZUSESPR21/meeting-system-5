package com.team.meetingsystem.controller;

import com.team.meetingsystem.dao.ForumMapper;
import com.team.meetingsystem.model.ResponseMessage;
import com.team.meetingsystem.service.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/homepage")
public class ForumController {
    @Autowired
    private ForumService forumService;

    @GetMapping("/forum")
    public ResponseMessage all(){
        return ResponseMessage.success(forumService.selectAll());
    }

}

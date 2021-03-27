package com.team.meetingsystem.controller;

import com.team.meetingsystem.dao.AgendaMapper;
import com.team.meetingsystem.model.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/homepage")
public class AgendaController {
    @Autowired
    private AgendaMapper agendaMapper;
    @GetMapping("/agenda")
    public ResponseMessage agenda(){
        return ResponseMessage.success(agendaMapper.selectAll());
    }
}

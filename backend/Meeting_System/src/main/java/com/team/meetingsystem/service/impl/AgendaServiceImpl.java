package com.team.meetingsystem.service.impl;
import com.team.meetingsystem.dao.AgendaMapper;
import com.team.meetingsystem.model.Agenda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AgendaServiceImpl implements AgendaService {
    @Autowired
    private  AgendaMapper agendaMapper;
    public List<Agenda> getAgenda() {
//        return accountMapper.selectAll();

        return agendaMapper.selectAll();
    }
}

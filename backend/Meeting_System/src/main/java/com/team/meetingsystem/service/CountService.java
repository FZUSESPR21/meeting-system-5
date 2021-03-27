package com.team.meetingsystem.service;

import com.team.meetingsystem.model.Agenda;

import java.util.List;

public interface CountService {
    Integer getMetingCount();
    Integer getForumCount(Integer status);
}

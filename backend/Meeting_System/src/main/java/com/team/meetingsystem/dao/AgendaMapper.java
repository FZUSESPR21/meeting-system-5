package com.team.meetingsystem.dao;

import com.team.meetingsystem.model.Agenda;

import java.util.List;

/**
 * @date 2021/03/27
 */
public interface AgendaMapper {

    List<Agenda> selectAll();

}
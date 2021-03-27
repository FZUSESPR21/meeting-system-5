package com.team.meetingsystem.service;

import com.team.meetingsystem.model.Notice;

import java.util.Date;
import java.util.List;

public interface NoticeService {
    public void insert(Date starttime, String content,Integer forumId);
    public List<Notice> selectAll(Integer forumId);
}

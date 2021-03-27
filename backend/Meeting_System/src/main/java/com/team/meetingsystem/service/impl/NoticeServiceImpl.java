package com.team.meetingsystem.service.impl;

import com.team.meetingsystem.dao.NoticeMapper;
import com.team.meetingsystem.model.Notice;
import com.team.meetingsystem.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public void insert(Date publishtime,String content,Integer forumId) {
        noticeMapper.insert(new Notice(publishtime,content,forumId));

    }

    @Override
    public List<Notice> selectAll(Integer forumId) {
        return noticeMapper.selectByID(forumId);
    }
}

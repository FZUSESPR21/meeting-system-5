package com.team.meetingsystem.service.impl;

import com.team.meetingsystem.dao.ForumMapper;
import com.team.meetingsystem.model.Forum;
import com.team.meetingsystem.service.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForumServiceImpl implements ForumService {

    @Autowired
    private ForumMapper forumMapper;

    @Override
    public List<Forum> selectAll() {

        return forumMapper.selectAll();
    }
}

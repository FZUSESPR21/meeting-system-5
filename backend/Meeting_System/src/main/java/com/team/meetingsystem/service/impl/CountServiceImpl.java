package com.team.meetingsystem.service.impl;

import com.team.meetingsystem.dao.AccountMapper;
import com.team.meetingsystem.model.Account;
import com.team.meetingsystem.service.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountServiceImpl implements CountService {
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public Integer getMetingCount() {
        return accountMapper.MeetingAccountCount();
    }

    @Override
    public Integer getForumCount(Integer status) {
        return accountMapper.ForumAccountCount(status);
    }
}

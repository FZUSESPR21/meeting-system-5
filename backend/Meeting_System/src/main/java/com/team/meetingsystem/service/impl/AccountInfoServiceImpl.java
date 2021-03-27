package com.team.meetingsystem.service.impl;

import com.team.meetingsystem.dao.AccountMapper;
import com.team.meetingsystem.model.Account;
import com.team.meetingsystem.service.AccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountInfoServiceImpl implements AccountInfoService {
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public List<Account> selectAll() {

        List<Account> accountList= accountMapper.selectAll();
        for (Account account:accountList
             ) {
            account.setPassword(" ");
        }
        return accountList;
    }
}

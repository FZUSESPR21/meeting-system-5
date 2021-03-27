package com.team.meetingsystem.service.impl;

import com.team.meetingsystem.dao.AccountMapper;
import com.team.meetingsystem.model.Account;
import com.team.meetingsystem.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @date 2021/03/27
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public boolean login(Account account) {
        return false;
    }

    @Override
    public List<Account> getAccounts() {
        return accountMapper.selectAll();
    }
}

package com.team.meetingsystem.service.impl;

import com.team.meetingsystem.model.Account;
import com.team.meetingsystem.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @date 2021/03/27
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Override
    public boolean login(Account account) {
        return false;
    }

    @Override
    public List<Account> getAccounts() {
//        return accountMapper.selectAll();
        return null;
    }
}

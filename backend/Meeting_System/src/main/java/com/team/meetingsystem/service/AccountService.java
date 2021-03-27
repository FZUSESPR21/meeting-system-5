package com.team.meetingsystem.service;

import com.team.meetingsystem.model.Account;

import java.util.List;

/**
 * @date 2021/03/27
 */
public interface AccountService {

    boolean login(Account account);

    List<Account> getAccounts();
}

package com.team.meetingsystem.service;

import com.team.meetingsystem.model.Account;
import com.team.meetingsystem.model.AccountForum;
import com.team.meetingsystem.model.Notice;

import java.util.List;

/**
 * @date 2021/03/27
 */
public interface AccountService {

    boolean checkAccountExists(String name);        //判断用户是否存在
    boolean checkPassword(String name, String password);             //判断密码是否正确
    boolean checkStatus(Account account);
    void register(Account account);
    void insertAccountForum(AccountForum accountForum);


    List<Account> getAccounts();        //返回用户列表

    Account getAccountByName(String name);

    List<AccountForum> getAccountForums(String name);

    List<Notice> getNoticeByForumid(Integer forumid);
}

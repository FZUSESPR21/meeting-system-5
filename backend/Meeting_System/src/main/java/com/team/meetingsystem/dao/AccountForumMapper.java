package com.team.meetingsystem.dao;

import com.team.meetingsystem.model.AccountForum;

import java.util.List;

/**
 * @date 2021/03/27
 */
public interface AccountForumMapper {

    void insert(AccountForum accountForum);

    List<AccountForum> selectByName(String accountName);

}

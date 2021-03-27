package com.team.meetingsystem.dao;

import com.team.meetingsystem.model.AccountForum;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @date 2021/03/27
 */
@Mapper
public interface AccountForumMapper {

    void insert(AccountForum accountForum);

    List<AccountForum> selectByName(String accountName);

}

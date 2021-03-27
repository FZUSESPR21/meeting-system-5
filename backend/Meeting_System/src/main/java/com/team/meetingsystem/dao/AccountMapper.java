package com.team.meetingsystem.dao;

import com.team.meetingsystem.model.Account;
import org.apache.ibatis.annotations.Mapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 *
 * @date 2021/03/27
 */
@Mapper
public interface AccountMapper {

    Account selectByName(String name);

    void insert(Account account);

    Integer MeetingAccountCount();
    Integer ForumAccountCount(Integer status);

    List<Account> selectAll();

}

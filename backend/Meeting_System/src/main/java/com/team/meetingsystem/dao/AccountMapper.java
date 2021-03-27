package com.team.meetingsystem.dao;

import com.team.meetingsystem.model.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * @date 2021/03/27
 */
@Mapper
public interface AccountMapper {

    List<Account> selectAll();

    Account selectByName(String name);

}

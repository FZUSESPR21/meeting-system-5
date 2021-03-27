package com.team.meetingsystem.dao;

import com.team.meetingsystem.model.Notice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @date 2021/03/27
 */
@Mapper
public interface NoticeMapper {

    void insert(Notice notice);

    List<Notice> selectByID(Integer forumId);

}

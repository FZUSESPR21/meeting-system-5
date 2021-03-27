package com.team.meetingsystem.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @date 2021/03/27
 */
public class Forum {
    private Integer id;
    private String title;
    private String accountName;

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    public Forum(Integer id, String title, String accountName, Date startTime) {
        this.id = id;
        this.title = title;
        this.accountName = accountName;
        this.startTime = startTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "Forum{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", accountName='" + accountName + '\'' +
            ", startTime=" + startTime +
            '}';
    }
}

package com.team.meetingsystem.model;

import java.util.Date;

public class Agenda {

    private Date startTime;
    private Date endTime;
    private String content;

    public Agenda(Date startTime, Date endTime, String content) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.content = content;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

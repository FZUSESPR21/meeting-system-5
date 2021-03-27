package com.team.meetingsystem.model;

import java.util.Date;

/**
 * @date 2021/03/27
 */
public class Notice {
    private Date publishTime;
    private String content;
    private Integer forumId;

    public Notice(Date publishTime, String content, Integer forumId) {
        this.publishTime = publishTime;
        this.content = content;
        this.forumId = forumId;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getForumId() {
        return forumId;
    }

    public void setForumId(Integer forumId) {
        this.forumId = forumId;
    }

    @Override
    public String toString() {
        return "Notice{" +
            "publishTime=" + publishTime +
            ", content='" + content + '\'' +
            ", forumId=" + forumId +
            '}';
    }
}

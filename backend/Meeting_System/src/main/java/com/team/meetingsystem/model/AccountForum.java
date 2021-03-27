package com.team.meetingsystem.model;

/**
 * @date 2021/03/27
 */
public class AccountForum {
    private String accountName;
    private Integer forumId;

    public AccountForum(String accountName, Integer forumId) {
        this.accountName = accountName;
        this.forumId = forumId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Integer getForumId() {
        return forumId;
    }

    public void setForumId(Integer forumId) {
        this.forumId = forumId;
    }

    @Override
    public String toString() {
        return "AccountForum{" +
            "accountName='" + accountName + '\'' +
            ", forumId=" + forumId +
            '}';
    }
}

package com.team.meetingsystem.model;

/**
 *
 * @date 2021/03/27
 */
public class Account {
    private String name;
    private String password;
    private Integer status;

    public Account(String name, String password, Integer status) {
        this.name = name;
        this.password = password;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Account{" +
            "name='" + name + '\'' +
            ", password='" + password + '\'' +
            ", status=" + status +
            '}';
    }
}

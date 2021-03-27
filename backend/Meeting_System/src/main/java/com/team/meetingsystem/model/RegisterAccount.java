package com.team.meetingsystem.model;

import java.util.List;

public class RegisterAccount {
    private String name;
    private String password;
    private List<Integer> forums;

    public RegisterAccount(String name, String password, List<Integer> forums) {
        this.name = name;
        this.password = password;
        this.forums = forums;
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

    public List<Integer> getForums() {
        return forums;
    }

    public void setForums(List<Integer> forums) {
        this.forums = forums;
    }
}

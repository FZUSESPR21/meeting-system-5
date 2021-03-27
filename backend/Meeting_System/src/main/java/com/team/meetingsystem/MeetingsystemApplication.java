package com.team.meetingsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.team.meetingsystem.dao")
@SpringBootApplication
public class MeetingsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeetingsystemApplication.class, args);
    }

}

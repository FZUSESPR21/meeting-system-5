package com.team.meetingsystem.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class SessionConfiguration extends WebMvcConfigurerAdapter {
    @Override
    public void  addInterceptors(InterceptorRegistry registry){
        InterceptorRegistration addInterceptor = registry.addInterceptor(new SessionInterceptor());

        addInterceptor.excludePathPatterns("/index");
        addInterceptor.excludePathPatterns("/login");

        addInterceptor.addPathPatterns("/");        //拦截路径为整个项目
    }

}

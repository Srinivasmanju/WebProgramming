package com.JPAFirstClass.carapp;

import com.JPAFirstClass.carapp.Services.MyServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public MyServices myservices(){
        return new MyServices();
    }
}

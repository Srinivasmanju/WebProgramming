package com.SpringDemoDay7.Bootdemo;

import com.SpringDemoDay7.Bootdemo.Service.MyServices;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public MyServices myservices(){
       return  new MyServices();
    }
}

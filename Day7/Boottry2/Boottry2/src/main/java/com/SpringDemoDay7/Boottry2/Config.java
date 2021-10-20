package com.SpringDemoDay7.Boottry2;

import com.SpringDemoDay7.Boottry2.Service.MyServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public MyServices myservices(){
        return  new MyServices();
    }
}

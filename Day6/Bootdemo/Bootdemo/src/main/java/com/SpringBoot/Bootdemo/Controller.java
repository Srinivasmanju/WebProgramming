package com.SpringBoot.Bootdemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    Demo demo;

    @PostMapping(value = "/login")
    public String Login(@RequestBody Login login) {
        System.out.println(login.getUsername());
        System.out.println(login.getPassword());
        return "login is done";
    }
    @GetMapping(value = "params")
    public String params(@RequestParam String name,@RequestParam String pass){
        System.out.println(name);
        System.out.println(pass);
        return "hello " +name;
    }
    @GetMapping(value = "header")
    public String header(@RequestHeader("name") String name,@RequestHeader("pass") String pass){
        System.out.println(name);
        System.out.println(pass);
        return "hello " +name;
    }
    //request-> url https://www.google.com //general part, header, body, params
// header-> authentication info[username= srini&pass="123"]encoded, body[json], params
//json[ket: value, key: value] map
}
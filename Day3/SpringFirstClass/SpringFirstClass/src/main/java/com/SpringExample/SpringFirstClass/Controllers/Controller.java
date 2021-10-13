package com.SpringExample.SpringFirstClass.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //manage the request from user
public class Controller {

    @RequestMapping(value = "/home")
    public String home(){
        return "Home";
    }
    @RequestMapping(value = "about")
    public String about(){
        return "your are in about page";
    }
    @RequestMapping(value = "calculator")
    public int cal(){
        return 4;
    }

    @GetMapping(value = "home")
    public void getmap(){

    }

    @GetMapping (value = "/post")
    public String post(){
        return "post";
    }

}

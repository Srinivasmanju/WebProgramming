package com.jsp.demo.demo.Controller;

import com.Student;
import com.jsp.demo.demo.models.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controllers {
    @Autowired
    Model model;
    @RequestMapping("/home")
    public String home(){
        return "home";
    }
    @RequestMapping("/form")
    public String form(){
        return "form";
    }

    @RequestMapping("/save")
    public String save(@ModelAttribute("student")Student student){
        System.out.println(student.name);
        model.insert(student);
        return "completed";
        
    }
    
}

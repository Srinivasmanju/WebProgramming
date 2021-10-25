package com.jsp.demo.demo.Controller;

import java.sql.SQLException;
//import java.util.List;

import com.Student;

//import com.jsp.demo.demo.Config.Config;
import com.jsp.demo.demo.models.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controllers {
    @Autowired
   // Config config;
Model model;
    @RequestMapping("/home")
    public String home(){
        return "home";
    }
    /*
    @PostMapping("insert")
    public void insert(@ModelAttribute("student")Student student){
     return "update";
    }
    @GetMapping("delete")
    public void delete(@ModelAttribute("student")Student student){
        student.getId();
    }
   */
    @RequestMapping("/form")
    public String form(){
        return "form";
    }

    @RequestMapping("/save")
    public String save(@ModelAttribute("student")Student student) throws ClassNotFoundException, SQLException{
        System.out.println(student.name);
        System.out.println(student.college);
        System.out.println(student.branch);
        
        model.insert(student);
        return "completed";
        
    }
   /* @GetMapping({"student"})
    public List<String> Student() {
       
    return config.studentform();
    }
 */   
}

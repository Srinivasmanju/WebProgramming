//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.SpringBootJdbcTemplate.Jdbc;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    Demo demo;

    public Controller() {
    }

    @GetMapping({"/studentname"})
    public String studentname() {
        return "studentname";
    }

    @GetMapping({"studentnames"})
    public List<String> studentnames() {
        return this.demo.getAllStudentNames();
    }

    @GetMapping({"studentplaces"})
    public List<String> studentolaces() {
        return this.demo.getAllStudentPlaces();
    }
}

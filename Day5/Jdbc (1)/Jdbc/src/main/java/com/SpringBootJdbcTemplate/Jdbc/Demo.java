package com.SpringBootJdbcTemplate.Jdbc;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Demo {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public Demo() {
    }

    public List<String> getAllStudentNames() {
        List<String> names = new ArrayList();
        names.addAll(this.jdbcTemplate.queryForList("select name from student", String.class));

        return names;
    }
    public List<String> getAllStudentPlaces() {
        List<String> places = new ArrayList();
        places.addAll(this.jdbcTemplate.queryForList("select place from student", String.class));
        return places;
    }
}

package com.jsp.demo.demo.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Student;


import org.springframework.stereotype.Repository;

@Repository
public class Model {
    Connection con;
    public void insert(Student student) throws ClassNotFoundException, SQLException{
        String addr = "jdbc:mysql://localhost:3306/studentform";
        String username= "root";
        String password= "root";
        Class.forName("com.mysql.cj.jdbc.Driver");
        con= DriverManager.getConnection(addr, username, password);
        String sql = "insert into student values (?,?,?,?);";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1,student.name);
        stmt.setString(2,student.college);
        stmt.setString(3,student.branch);
        stmt.setInt(4,student.age);
        stmt.execute();
        System.out.println("Records inserted succesfully");
        con.close();
    }
}

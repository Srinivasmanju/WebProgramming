package com.miniproject.springbootbackend.model;

import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class Model {
    Connection con;
    public void insert(Employee employees) throws ClassNotFoundException, SQLException {
        String addr = "jdbc:mysql://localhost:3306/ems";
        String username= "root";
        String password= "root";
        Class.forName("com.mysql.cj.jdbc.Driver");
        con= DriverManager.getConnection(addr, username, password);
        String sql = "insert into employees values (?,?,?,?);";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1,employees.id);
        stmt.setString(3,employees.firstName);
        stmt.setString(4,employees.lastName);
        stmt.setString(2,employees.emailId);
        stmt.execute();
        System.out.println("Records inserted succesfully");
        con.close();
    }
}

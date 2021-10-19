package com.Spring.BankApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Demo {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public Demo(){

    }
    public List<String> getBanknames(){
        List<String> bankname = new ArrayList();
        bankname.addAll(this.jdbcTemplate.queryForList("select bankname from bank",String.class));
    return bankname;
    }
    public List<String> getCustomernames(){
        List<String>customername = new ArrayList();
        customername.addAll(this.jdbcTemplate.queryForList("select customername from customer",String.class));
        return customername;
    }
    public List<String> getaxis(){
        List<String> axis = new ArrayList();
        axis.addAll(this.jdbcTemplate.queryForList("select customername from customer where bankname='Axis' ",String.class));
        axis.addAll(this.jdbcTemplate.queryForList("select branch from bank where bankname='Axis' ",String.class));
        axis.addAll(this.jdbcTemplate.queryForList("select bankid from bank where bankname='Axis' ",String.class));
        return axis;
    }
    public List<String> getsbi(){
        List<String> sbi = new ArrayList();
        sbi.addAll(this.jdbcTemplate.queryForList("select customername from customer where bankname='sbi' ",String.class));
        sbi.addAll(this.jdbcTemplate.queryForList("select branch from bank where bankname='sbi' ",String.class));
        sbi.addAll(this.jdbcTemplate.queryForList("select bankid from bank where bankname='sbi' ",String.class));
        return sbi;
    }
}

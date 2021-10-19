package com.Spring.BankApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    Demo demo;
    public Controller(){

    }
@GetMapping({"banknames"})
    public List<String> bankname() {
    return this.demo.getBanknames();
}
    @GetMapping({"bankname_axis"})
    public List<String> axis() {
        return this.demo.getaxis();
    }
    @GetMapping({"bankname_sbi"})
    public List<String> sbi() {
        return this.demo.getsbi();
    }
    @GetMapping({"customernames"})
    public List<String> customername() {
        return this.demo.getCustomernames();
    }
}

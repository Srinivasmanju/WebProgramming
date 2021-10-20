package com.JPAFirstClass.carapp.Controller;

import com.JPAFirstClass.carapp.Cars;
import com.JPAFirstClass.carapp.Services.MyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    MyServices myservices;
    @GetMapping("car")
    public List<Cars> books(){
        return myservices.getcars();
    }
    @PostMapping("addcar")
    public Cars addCar(@RequestBody Cars car){
        return myservices.addcars(car);
    }
    @GetMapping("carbyid")
    public Cars carByid(@RequestParam("id") int id){
        return myservices.getByid(id);
    }
}

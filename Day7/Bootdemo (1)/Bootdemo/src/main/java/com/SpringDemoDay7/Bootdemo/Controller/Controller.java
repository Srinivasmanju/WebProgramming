package com.SpringDemoDay7.Bootdemo.Controller;

import com.SpringDemoDay7.Bootdemo.Books;
import com.SpringDemoDay7.Bootdemo.Service.MyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    MyServices myservices;
    @GetMapping("book")
    public List<Books> books(){
        return myservices.getBooks();
    }
    @PostMapping("addbook")
    public Books addBook(@RequestBody Books book){
        return myservices.addBooks(book);
    }
    @GetMapping("bookbyid")
    public Books bookByid(@RequestParam("id") int id){
        return myservices.getByid(id);
    }
}

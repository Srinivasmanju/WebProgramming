package com.SpringDemoDay7.Boottry2.Controller;


import com.SpringDemoDay7.Boottry2.Books;
import com.SpringDemoDay7.Boottry2.Service.MyServices;
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
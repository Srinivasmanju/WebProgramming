package com.SpringDemoDay7.Bootdemo.Service;

import com.SpringDemoDay7.Bootdemo.Books;

import java.util.List;

public interface MyServicesinterface {
    public List<Books> getBooks();
    public Books addBooks(Books books);
    public Books getByid(int id);
}

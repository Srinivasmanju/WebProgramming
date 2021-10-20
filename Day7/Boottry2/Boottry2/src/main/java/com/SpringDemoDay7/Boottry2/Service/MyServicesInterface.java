package com.SpringDemoDay7.Boottry2.Service;

import com.SpringDemoDay7.Boottry2.Books;

import java.util.List;

interface MyServicesinterface {
    public List<Books> getBooks();
    public Books addBooks(Books books);
    public Books getByid(int id);
}

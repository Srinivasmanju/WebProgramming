package com.SpringDemoDay7.Boottry2.Service;

import com.SpringDemoDay7.Boottry2.Books;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyServices implements  MyServicesinterface {

    List<Books> list = new ArrayList<Books>();
    public MyServices(){
        this.list.add(new Books(12,"java","About java"));
        this.list.add(new Books(13,"Python","About java"));
    }
    //get all books from the library
    @Override
    public List<Books> getBooks() {
        return list;
    }

    @Override
    public Books addBooks(Books books) {
        this.list.add(books);
        return books;
    }

    @Override
    public Books getByid(int id) {
        for(Books books: this.list){
            if(books.getId()==id){
                return books;
            }
        }
        return  null;
    }
}
package com.JPAFirstClass.carapp.Services;

import com.JPAFirstClass.carapp.Cars;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyServices implements MyServicesInterface {
    List<Cars> list = new ArrayList<Cars>();
    public MyServices(){
        this.list.add(new Cars(01,"BMW"," Germany Brand"));
        this.list.add(new Cars(02,"Tesla","US Brand"));
    }
    //get all books from the library
    @Override
    public List<Cars> getcars() {
        return list;
    }

    @Override
    public Cars addcars(Cars car) {
        this.list.add(car);
        return car;
    }

    @Override
    public Cars getByid(int id) {
        for(Cars cars: this.list){
            if(cars.getId()==id){
                return cars;
            }
        }
        return  null;
    }
}

package com.JPAFirstClass.carapp.Services;

import com.JPAFirstClass.carapp.Cars;

import java.util.List;

public interface MyServicesInterface {
    public List<Cars> getcars();
    public Cars addcars(Cars books);
    public Cars getByid(int id);
}

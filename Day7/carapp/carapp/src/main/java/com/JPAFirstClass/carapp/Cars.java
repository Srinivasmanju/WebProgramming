package com.JPAFirstClass.carapp;

public class Cars {
    int id;
    String name;
    String dis;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDis() {
        return dis;
    }

    public void setDis(String dis) {
        this.dis = dis;
    }

    public Cars(int id, String name, String dis) {
        this.id = id;
        this.name = name;
        this.dis = dis;
    }

}
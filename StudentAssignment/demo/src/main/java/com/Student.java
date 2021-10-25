package com;

public class Student {
    public String name;
    public String college;
    public String branch;
    public int age;
    public Student(String name, String college, String branch,int age){
        this.name= name;
        this.college= college;
        this.branch= branch;
        this.age= age;
    }
    public String  getname(){
        return name;
    }
    public void setname(String name){
        this.name= name;
    }
    public String getcollege(){
        return college;
    }
    public void setcollege(String college){
        this.college= college;
    }
    public String getbranch(){
        return branch;
    }
    public void setbranch(String branch){
        this.branch= branch;
    }
    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age= age;
    }
   
}

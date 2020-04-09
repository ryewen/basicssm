package com.loststars.basicssm.model;

public class Student {

    private int id;
    
    private int age;
    
    private String name;
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public String info() {
        return String.format("id: %d, name: %s, age: %d", id, name, age);
    }
}

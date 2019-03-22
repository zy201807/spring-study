package com.zy.demo;

public class BookService {
    public BookService(String name, Integer age) {
        super();
        this.name = name;
        this.age = age;
    }
    private String name;
    private Integer age;
    public BookService() {
    
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}

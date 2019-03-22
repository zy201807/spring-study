package com.zy.demo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Customer {
    private String name;
    private List<String> list;
    private Set<String> set;
    private Map<Integer,String> map;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }


    
}

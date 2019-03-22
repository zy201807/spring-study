package com.zy.demo;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {
    @Test
    public void test() {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        Customer collect= (Customer) ctx.getBean("collections");

       System.out.println(collect.getName()+"\n==============================");

       List<String> list=collect.getList();
       for (String s:list) {
           System.out.println(s);
       }

       Set<String> set=collect.getSet();
       for (String s:set) {
           System.out.println(s);
       }

       Map<Integer,String> map=collect.getMap();
       Set<Integer> integerSet = map.keySet();
       for (Integer i : integerSet) {
           System.out.println(i+"-"+map.get(i));
       }

 
    }
}

package com.zy.demo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookServiceTest {

    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"); 
//       BookService bss=(BookService) context.getBean("bookService");
//        BookService bss= context.getBean(BookService.class);
        BookService bss= context.getBean("bookService", BookService.class);
       System.out.println(bss.getName());      
       context.close();
 
    }

}

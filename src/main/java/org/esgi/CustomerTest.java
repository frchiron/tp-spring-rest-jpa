package org.esgi;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("org.esgi");
        appContext.refresh();

        CustomerService customerService = (CustomerService) appContext.getBean("customerService");
        customerService.test();

        appContext.close();
    }

}
package com.kirillvlasovets.spring.rest;

import com.kirillvlasovets.spring.rest.configuration.MyConfig;
import com.kirillvlasovets.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

//        System.out.println(communication.getAllEmployees());
//
//        System.out.println(communication.getEmployee(2));

//        Employee employee = new Employee("Sveta", "Sokolova", "IT", 5000);
//        employee.setId(5);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(5);
    }
}

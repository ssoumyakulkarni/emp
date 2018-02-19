package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {
    List<Employee> employeesList = new ArrayList<Employee>();
    public EmployeeController(){
        for(int i=1; i<=15; i++){
        this.employeesList.add(new Employee(i,"fName"+i+"","lName"+i+"","email"+i+"@gmail.com"));
    }
}
    @GetMapping("/")
    public List<Employee> getEmployees(){
        return this.employeesList;
    }

}

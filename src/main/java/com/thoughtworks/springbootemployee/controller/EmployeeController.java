package com.thoughtworks.springbootemployee.controller;

import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//restful风格API
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //定义API路径
    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id){
        return employeeService.getEmployee(id);
    }

    @PostMapping("/employees")
    public void addEmployee(Employee employee) {
        employeeService.addEmployee(employee);
    }

    @PutMapping("/employees")
    public void modifyEmployee(Employee employee) {
        employeeService.modifyEmployee(employee);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
    }
}

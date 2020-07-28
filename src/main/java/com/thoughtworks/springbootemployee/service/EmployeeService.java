package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//自动创建对象
@Service
public class EmployeeService {

    private final List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployees() {
        return employees;
    }

    public Employee getEmployee(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void modifyEmployee(Employee newEmployee) {
        Employee originEmployee = this.getEmployee(newEmployee.getId());
        if (originEmployee != null) {
            employees.remove(originEmployee);
            employees.add(newEmployee);
        }

    }


    public void deleteEmployee(int id) {
        Employee originEmployee = this.getEmployee(id);
        if (originEmployee != null) {
            employees.remove(originEmployee);
        }
    }
}

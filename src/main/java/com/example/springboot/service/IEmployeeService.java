package com.example.springboot.service;

import com.example.springboot.model.Employee;

import java.util.List;

public interface IEmployeeService {
    public Employee addEmployee(Employee employee);
    public Employee updateEmployee(long id, Employee employee);
    public boolean deleteEmployee(long id);
    public List<Employee> getAllEmployee();
    public Employee getOneEmployee(long id);
}

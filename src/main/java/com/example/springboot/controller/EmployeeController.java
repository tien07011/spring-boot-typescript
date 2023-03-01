package com.example.springboot.controller;

import com.example.springboot.model.Employee;
import com.example.springboot.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService iEmployeeService;

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return iEmployeeService.addEmployee(employee);
    }

    @PutMapping("/update")
    public Employee updateEmployee(@RequestParam("id") long id, @RequestBody Employee employee) {
        return iEmployeeService.updateEmployee(id, employee);
    }

    @DeleteMapping ("/delete")
    public boolean deleteEmployee(@RequestParam("id") long id) {
        return iEmployeeService.deleteEmployee(id);
    }

    @GetMapping("/list")
    public List<Employee> getAllEmployee() {
        return iEmployeeService.getAllEmployee();
    }

    @GetMapping("/list/{id}")
    public Employee getOneEmployee(@PathVariable("id") long id) {
        return iEmployeeService.getOneEmployee(id);
    }
}

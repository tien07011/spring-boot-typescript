package com.example.springboot.service;

import com.example.springboot.model.Employee;
import com.example.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImplement implements IEmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        if (employee != null) {
            employeeRepository.save(employee);
        }
        return null;
    }

    @Override
    public Employee updateEmployee(long id, Employee employee) {
        if (employee != null) {
            Employee employee1 = employeeRepository.getById(id);
            if (employee1 != null) {
                employee1.setName(employee.getName());
                employee1.setAddress(employee.getAddress());

                return employeeRepository.save(employee1);
            }
        }
        return null;
    }

    @Override
    public boolean deleteEmployee(long id) {
        if (id > 0) {
            employeeRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getOneEmployee(long id) {
        return employeeRepository.getById(id);
    }
}

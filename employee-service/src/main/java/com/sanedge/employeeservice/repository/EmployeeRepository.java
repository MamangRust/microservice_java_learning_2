package com.sanedge.employeeservice.repository;

import java.util.*;

import com.sanedge.employeeservice.model.Employee;

public class EmployeeRepository {
    public List<Employee> employees = new ArrayList<>();

    public Employee add(Employee employee) {
        employee.setId((long) (employees.size() + 1));
        employees.add(employee);
        return employee;
    }

    public Employee findById(Long id) {
        return employees.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst()
                .orElseThrow();
    }

    public List<Employee> findAll() {
        return employees;
    }

    public List<Employee> findByDepartment(Long departmentId) {
        return employees.stream()
                .filter(a -> a.getDepartmentId().equals(departmentId))
                .toList();
    }

    public List<Employee> findByOrganization(Long organizationId) {
        return employees.stream()
                .filter(a -> a.getOrganizationId().equals(organizationId))
                .toList();
    }
}

package com.sanedge.organizationservice.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sanedge.organizationservice.model.Employee;

@FeignClient(name = "employee-service")
public interface EmployeeClient {
    @GetMapping("/organization/{organizationId}")
    List<Employee> findByOrganization(@PathVariable("organizationId") Long organizationId);
}

package com.sqlserver.controller;

import com.sqlserver.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.sqlserver.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/emp")
	public List<Employee> getAll(){
		return employeeService.getAllEmployee();
	}
	
	@GetMapping("/emp/{id}")
	public Employee getEmployee(@PathVariable long id){
		return employeeService.getEmployeeById(id);
	}
	
	@PostMapping("/emp")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
	@PutMapping("/emp/{id}")
	public Employee editEmployee(@RequestBody Employee employee, @PathVariable long id) {
		return employeeService.editEmployee(employee, id);
	}
	
	@DeleteMapping("/emp/{id}")
	public String deleteEmployee(@PathVariable long id) {
		employeeService.deleteEmployee(id);
		return "Successfully Deleted";
	}
	
}

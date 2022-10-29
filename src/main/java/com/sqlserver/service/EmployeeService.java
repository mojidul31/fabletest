package com.sqlserver.service;

import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sqlserver.model.Employee;
import com.sqlserver.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(Employee model) {
		model.setCreatedOn(Instant.now());
		return employeeRepository.save(model);
	}
	
	public Employee editEmployee(Employee model, long id) {
		Employee entity = employeeRepository.findById(id).get();
		entity.setName(model.getName());
		entity.setEmail(model.getEmail());
		entity.setPhone(model.getPhone());
		entity.setCreatedOn(Instant.now());
		return employeeRepository.save(entity);
	}
	
	public void deleteEmployee(long id) {
		//Employee entity = employeeRepository.findById(id).get();
		//employeeRepository.delete(entity);
		employeeRepository.deleteById(id);
	}
	
	public Employee getEmployeeById(long id) {
		return employeeRepository.findById(id).get();
	}
	
	public List<Employee> getAllEmployee(){
		return employeeRepository.findAll();
	}
}

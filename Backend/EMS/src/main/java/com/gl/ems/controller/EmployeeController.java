package com.gl.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.ems.dto.EmployeeDto;
import com.gl.ems.model.Department;
import com.gl.ems.model.Employee;
import com.gl.ems.service.EmployeeService;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping
	ResponseEntity<EmployeeDto> createDepartment (@RequestBody EmployeeDto employeeDto){
		EmployeeDto e=employeeService.createEmployee(employeeDto);
		return new ResponseEntity<>(e,HttpStatus.CREATED);
	}
	@GetMapping("{id}")
	ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id")int id){
		EmployeeDto e=employeeService.getEmployeeById(id);
		return new ResponseEntity(e,HttpStatus.OK);
	}
	@PutMapping("{id}")
	ResponseEntity<EmployeeDto> updateDepartmentById(@PathVariable("id")int id,@RequestBody EmployeeDto employeeDto){
	EmployeeDto e=employeeService.updateEmployeeById(id, employeeDto);
	return new ResponseEntity(e,HttpStatus.OK);
	}
	@DeleteMapping("{id}")
	ResponseEntity<EmployeeDto> deleteEmployeeById(@PathVariable("id")int id){
		employeeService.deleteEmployeeById(id);
		return new ResponseEntity("Employee delete successfully",HttpStatus.OK);
		
	}
	@GetMapping
	ResponseEntity<List<EmployeeDto>> getAllEmployees(){
		List<EmployeeDto> list=employeeService.getAllEmployees();
		return new ResponseEntity(list,HttpStatus.OK);
		
		
	}

}

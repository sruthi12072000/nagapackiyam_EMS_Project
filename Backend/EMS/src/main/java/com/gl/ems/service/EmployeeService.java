package com.gl.ems.service;

import java.util.List;

import com.gl.ems.dto.EmployeeDto;
import com.gl.ems.model.Employee;

public interface EmployeeService {
	EmployeeDto createEmployee(EmployeeDto dto);
	EmployeeDto getEmployeeById(int id);
	EmployeeDto updateEmployeeById(int id,EmployeeDto dto);
	List<EmployeeDto> getAllEmployees();
	void deleteEmployeeById(int id);

}

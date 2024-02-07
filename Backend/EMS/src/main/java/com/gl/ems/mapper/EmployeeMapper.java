package com.gl.ems.mapper;

import com.gl.ems.dto.EmployeeDto;
import com.gl.ems.model.Employee;

public class EmployeeMapper {
	
	// convert employee jpa entity into employee dto
	
	public static EmployeeDto mapToEmployeeDto(Employee employee){
		EmployeeDto dto=new EmployeeDto(employee.getId(),employee.getFirstName(),employee.getLastName(),employee.getEmail(),employee.getDepartment());
		return dto;
		
	}
	
	//  convert employee dto into employee jpa entity

    public static Employee mapToEmployee(EmployeeDto employeeDto){
    	Employee emp=new Employee(employeeDto.getId(),employeeDto.getFirstName(),employeeDto.getLastName(),employeeDto.getEmail(),employeeDto.getDepartment());
    	return emp;
        
    }


}

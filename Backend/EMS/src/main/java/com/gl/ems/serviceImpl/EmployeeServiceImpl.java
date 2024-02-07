package com.gl.ems.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.ems.dto.EmployeeDto;
import com.gl.ems.exception.ResourceNotFoundException;
import com.gl.ems.mapper.EmployeeMapper;
import com.gl.ems.model.Employee;
import com.gl.ems.repository.EmployeeRepository;
import com.gl.ems.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public EmployeeDto createEmployee(EmployeeDto employeeDto) {
		Employee emp=EmployeeMapper.mapToEmployee(employeeDto);
		Employee employee=employeeRepository.save(emp);
		return EmployeeMapper.mapToEmployeeDto(employee);
	}

	@Override
	public EmployeeDto getEmployeeById(int id) {
		Employee employee= employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee with id"+id+"does not exists"));
		return EmployeeMapper.mapToEmployeeDto(employee);
		
	}

	@Override
	public EmployeeDto updateEmployeeById(int id, EmployeeDto employeeDto) {
		Employee e=null;
	    e=employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee with id"+id+"does not exists"));
	    e.setFirstName(employeeDto.getFirstName());
	    e.setLastName(employeeDto.getLastName());
	    e.setEmail(employeeDto.getEmail());
	    employeeRepository.save(e);
		return EmployeeMapper.mapToEmployeeDto(e);
	}

	@Override
	public List<EmployeeDto> getAllEmployees() {
		List<Employee> list=employeeRepository.findAll();
		return list.stream().map((emp)->EmployeeMapper.mapToEmployeeDto(emp)).collect(Collectors.toList());
	}

	@Override
	public void deleteEmployeeById(int id) {
		Employee e=null;
	    e=employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee with id"+id+"does not exists"));
		employeeRepository.deleteById(id);
		
	}

	}

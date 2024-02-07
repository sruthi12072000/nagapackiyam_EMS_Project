package com.gl.ems.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.ems.dto.DepartmentDto;
import com.gl.ems.exception.ResourceNotFoundException;
import com.gl.ems.mapper.DepartmentMapper;
import com.gl.ems.model.Department;
import com.gl.ems.repository.DepartmentRepository;
import com.gl.ems.service.DepartmentService;
@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	DepartmentRepository departmentRepository;

	@Override
	public DepartmentDto createDepartment(DepartmentDto dto) {
		Department department=DepartmentMapper.mapToDepartment(dto);
		return  DepartmentMapper.mapToDepartmentDto(departmentRepository.save(department)) ;
		
	}

	@Override
	public DepartmentDto getDepartmentById(int id) {
		Department d=null;
		d=departmentRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Department is not exists with a given id :" +id));
		return DepartmentMapper.mapToDepartmentDto(d);
		
		
	}

	@Override
	public DepartmentDto updateDepartmentById(int id, DepartmentDto dto) {
		Department d=null;
		d=departmentRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Department is not exists with a given id :" +id));
		d.setDepartmentName(dto.getDepartmentName());
		d.setDepartmentDescription(dto.getDepartmentDescription());
		return DepartmentMapper.mapToDepartmentDto(departmentRepository.save(d));
		
	}

	@Override
	public List<DepartmentDto> getAllDepartments() {
		List<Department> list=departmentRepository.findAll();
		return list.stream().map((dep)->DepartmentMapper.mapToDepartmentDto(dep)).collect(Collectors.toList());
	}

	@Override
	public void deleteDepartmentById(int id) {
		Department d=null;
		d=departmentRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Department is not exists with a given id :" +id));
		departmentRepository.deleteById(id);
		
		
		
	}

}

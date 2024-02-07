package com.gl.ems.service;

import java.util.List;

import com.gl.ems.dto.DepartmentDto;
import com.gl.ems.model.Department;


public interface DepartmentService {
	DepartmentDto createDepartment(DepartmentDto dto);
	DepartmentDto getDepartmentById(int id);
	DepartmentDto updateDepartmentById(int id,DepartmentDto dto);
	List<DepartmentDto> getAllDepartments();
	void deleteDepartmentById(int id);

}

package com.gl.ems.mapper;

import com.gl.ems.dto.DepartmentDto;
import com.gl.ems.model.Department;

public class DepartmentMapper {
	// convert department jpa entity into department dto
    public static DepartmentDto mapToDepartmentDto(Department department){
    	DepartmentDto dto=new DepartmentDto(department.getId(),department.getDepartmentName(),department.getDepartmentDescription());
    	return dto;
    	
        
    }

    // convert department dto into department jpa entity
    public static Department mapToDepartment(DepartmentDto departmentDto){ 
    	Department dep=new Department(departmentDto.getId(),departmentDto.getDepartmentName(),departmentDto.getDepartmentDescription());
    	return dep;
        
    }

}

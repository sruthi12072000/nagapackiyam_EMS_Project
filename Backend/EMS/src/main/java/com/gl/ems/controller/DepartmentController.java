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

import com.gl.ems.dto.DepartmentDto;
import com.gl.ems.model.Department;
import com.gl.ems.service.DepartmentService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
	@Autowired
	DepartmentService departmentService;
	
	@PostMapping
	ResponseEntity<DepartmentDto> createDepartment (@RequestBody DepartmentDto dto){
		departmentService.createDepartment(dto);
		return new ResponseEntity<>(dto,HttpStatus.CREATED);
	}
	@GetMapping("{id}")
	ResponseEntity<DepartmentDto> getDepartmentById(@PathVariable("id")int id){
		DepartmentDto dto=departmentService.getDepartmentById(id);
		return new ResponseEntity(dto,HttpStatus.OK);
	}
	@PutMapping("{id}")
	ResponseEntity<DepartmentDto> updateDepartmentById(@PathVariable("id")int id,@RequestBody DepartmentDto dto){
	DepartmentDto d=departmentService.updateDepartmentById(id,dto);
	return new ResponseEntity(d,HttpStatus.OK);
	}
	@DeleteMapping("{id}")
	ResponseEntity<DepartmentDto> deleteById(@PathVariable("id")int id){
		departmentService.deleteDepartmentById(id);
		return new ResponseEntity("Department delete successfully",HttpStatus.OK);
		
	}
	@GetMapping
	ResponseEntity<List<DepartmentDto>> getAllDepartments(){
		List<DepartmentDto> list=departmentService.getAllDepartments();
		return new ResponseEntity(list,HttpStatus.OK);
		
		
	}
	

}

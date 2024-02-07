package com.gl.ems.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="departments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(unique = true,nullable = false)
	String departmentName;
	@Column(unique = true,nullable = false)
	String departmentDescription;

}

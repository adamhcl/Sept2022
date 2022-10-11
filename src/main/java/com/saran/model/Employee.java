package com.saran.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="springbootemp")
public class Employee {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int emp_id;
	private String emp_name;
	private String empemail;

}
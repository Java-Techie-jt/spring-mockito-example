package com.javatechie.spring.mockito.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Employee {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String dept;
}

package com.cg.jpa.sm.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

 @Entity
 @Table(name="employee")
 
public class Employee implements Serializable{
	 
	 private static final long serialVersionUID = 1L;
	 
	    //shop to employee
	    @ManyToOne
		@JoinColumn(name="shopEmployee_Id")
		private Shop Eshop_id;
	 
	     
	 
	 
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private int emp_id;
	 
	 @Column(name="name")
	 private String name;
	 
	 @Column(name="dob")
	 private LocalDate dob;
	 
	 @Column(name="salary")
	 private double salary;
	 
	 @Column(name="address")
	 private String address;
	 
	 @Column(name="designation")
	 private String designation;
	 
 }
 
	 
	 
	 
	 
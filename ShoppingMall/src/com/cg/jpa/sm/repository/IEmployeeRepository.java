package com.cg.jpa.sm.repository;

import com.cg.jpa.sm.entities.Employee;

public interface IEmployeeRepository {
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public Employee searchEmployee(long id);
	public boolean  deleteEmployee(long id);
	public abstract void beginTransaction();
	public abstract void commitTransaction();
}

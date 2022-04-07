package com.cg.jpa.sm.service;

import com.cg.jpa.sm.entities.Employee;
import com.cg.jpa.sm.repository.IEmployeeRepository;
import com.cg.jpa.sm.repository.IEmployeeRepositoryImpl;

public class IEmployeeServiceImpl implements IEmployeeService {
	
	private IEmployeeRepository repository;
	public IEmployeeServiceImpl()
	{
		repository=new IEmployeeRepositoryImpl();
	}
	@Override
	public Employee addEmployee(Employee employee) {
		repository.beginTransaction();
		
		repository.commitTransaction();
		return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		repository.beginTransaction();
		
		repository.commitTransaction();
		return null;
	}

	@Override
	public Employee searchEmployee(long id) {
		repository.beginTransaction();
		
		repository.commitTransaction();
		return null;
	}

	@Override
	public boolean deleteEmployee(long id) {
		repository.beginTransaction();
		
		repository.commitTransaction();
		return false;
	}

}

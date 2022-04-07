package com.cg.jpa.sm.service;

import com.cg.jpa.sm.entities.User;
import com.cg.jpa.sm.repository.IEmployeeRepository;
import com.cg.jpa.sm.repository.IEmployeeRepositoryImpl;
import com.cg.jpa.sm.repository.IUserRepository;
import com.cg.jpa.sm.repository.IUserRepositoryImpl;

public class IUserServiceImpl implements IUserService{
	
	private IUserRepository repository;
	public IUserServiceImpl()
	{
		repository=new IUserRepositoryImpl();
	}

	@Override
	public User addUser(User user) {
        repository.beginTransaction();
		
		repository.commitTransaction();
		return null;
	}

	@Override
	public User updateUser(User user) {
        repository.beginTransaction();
		
		repository.commitTransaction();
		return null;
	}

	@Override
	public User login(User user) {
        repository.beginTransaction();
		
		repository.commitTransaction();
		return null;
	}

	@Override
	public boolean logOut() {
        repository.beginTransaction();
		
		repository.commitTransaction();
		return false;
	}

}

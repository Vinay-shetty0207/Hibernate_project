package com.cg.jpa.sm.repository;

import com.cg.jpa.sm.entities.User;

public interface IUserRepository {
	public User addUser(User user);
	public User updateUser(User user);
	public User deleteUser(long id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}

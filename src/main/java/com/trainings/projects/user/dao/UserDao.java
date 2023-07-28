package com.trainings.projects.user.dao;

import java.util.List;

import com.trainings.projects.user.entity.User;

public interface UserDao {

	int create(User user);
	
	List<User> findUsers();
	
	User findUser(Integer id);
}

package com.trainings.projects.user.services;

import java.util.List;

import com.trainings.projects.user.entity.User;

public interface UserService {

	int save(User user);
	
	List<User> getUsers();
	
	User getUser(Integer id);
}

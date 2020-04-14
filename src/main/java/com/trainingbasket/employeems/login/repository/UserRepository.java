package com.trainingbasket.employeems.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trainingbasket.employeems.login.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUserName(String userName);

	User findByEmail(String email);
}

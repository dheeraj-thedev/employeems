package com.trainingbasket.employeems.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trainingbasket.employeems.login.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	Role findByRole(String role);
}

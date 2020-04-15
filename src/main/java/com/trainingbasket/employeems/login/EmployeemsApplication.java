package com.trainingbasket.employeems.login;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.trainingbasket.employeems.login.model.Role;
import com.trainingbasket.employeems.login.model.User;
import com.trainingbasket.employeems.login.repository.RoleRepository;
import com.trainingbasket.employeems.login.repository.UserRepository;

@SpringBootApplication
public class EmployeemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeemsApplication.class, args);
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder;
	}

	
//	CommandLineRunner init(RoleRepository roleRepository, UserRepository userRepository) {
//		return args -> {
//
//			Role userRole = roleRepository.findByRole("admin");
//			if (userRole == null) {
//				userRole = new Role();
//				userRole.setRole("admin");
//			
//				roleRepository.save(userRole);
//			}
//
//			User user = userRepository.findByUserName("amit");
//			if (user == null) {
//				user = new User();
//				user.setName("amitabh");
//				user.setActive(true);
//				user.setEmail("aa@aa.com");
//				user.setAddress("New Delhi Area");
//				user.setPassword("$2a$10$7PtcjEnWb/ZkgyXyxY1/Iei2dGgGQUbqIIll/dt.qJ8l8nQBWMbYO");
//				user.setMobile("9832938923");
//				user.setLastName("Singh");
//				user.setUserName("Raman");
//				user.setRoles(new HashSet(Arrays.asList(userRole)));
//				userRepository.save(user);
//			}
//
//		};
//	}
}

package com.trainingbasket.employeems.login.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")



public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Integer id;
	
	@Column(name = "user_name")
	@Length(min = 5,message = "The User name must have atleast 5 characters long")
	@NotEmpty(message = "Please provide name ")
	private String userName; 

	@Column(name = "first_name")
	@Length(min = 5,message = "The first name must have atleast 5 characters long")
	@NotEmpty(message = "Please provide name ")
	private String name;
	
	@Column(name = "last_name")
	@Length(min = 5,message = "The last name must have atleast 5 characters long")
	@NotEmpty(message = "Please provide name ")
	private String lastName;
	
	
	@Column(name = "email")
	@NotEmpty(message = "Please provide email ")
	private String email;
	
	@Column(name = "address")
	@NotEmpty(message = "Please provide address ")
	private String address;

	@Column(name= "is_active")
	private Boolean active;
	
	@Column(name= "mobile")
	@NotEmpty(message = "Please provide mobile ")
	private String mobile;
	
	@Column(name= "password")
	@NotEmpty(message = "Please provide password ")
	private String password;

	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;
}

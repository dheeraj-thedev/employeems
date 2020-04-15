package com.trainingbasket.employeems.login.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.trainingbasket.employeems.login.model.Role;
import com.trainingbasket.employeems.login.model.User;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserService userService;


	@Override
	@Transactional
	public UserDetails loadUserByUsername(String userName) {
		User user = userService.findUserByUserName(userName);
		  if(user == null){
		        throw new UsernameNotFoundException("User not authorized.");
		    }
		List<GrantedAuthority> authorities = getUserAuthority(user.getRoles());
		return buildUserForAuthentication(user, authorities);
//		User user = service.findUserByUserName(userName);
//		UserBuilder userBuilder = null;
//		if (user != null) {
//			userBuilder = org.springframework.security.core.userdetails.User.withUsername(userName);
//			userBuilder.password(bCryptPasswordEncoder.encode(user.getPassword()));
//		} else {
//			// throw new UsernameNotFoundException("User not found.");
//		}
//		return userBuilder.build();
	}

	
//	 UserInfo activeUserInfo = userInfoDAO.getActiveUser(userName);
//	    String dBuserName = activeUserInfo.getUserName();
//	  
//	    GrantedAuthority authority = new SimpleGrantedAuthority(activeUserInfo.getRole());
//	    UserDetails userDetails = (UserDetails)new User(dBuserName,
//	            activeUserInfo.getPassword(), Arrays.asList(authority));
//	    return userDetails;
//	    
	    
	private List<GrantedAuthority> getUserAuthority(Set<Role> userRoles) {
		Set<GrantedAuthority> roles = new HashSet<GrantedAuthority>();
		for (Role role : userRoles) {
			roles.add(new SimpleGrantedAuthority(role.getRole()));
		}
		List<GrantedAuthority> grantedAuthorities = new ArrayList<>(roles);
		return grantedAuthorities;
	}

	private UserDetails buildUserForAuthentication(User user, List<GrantedAuthority> authorities) {
		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),
				user.getActive(), true, true, true, authorities);
	}
}

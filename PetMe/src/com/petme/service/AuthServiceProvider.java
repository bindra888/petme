package com.petme.service;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.petme.util.UserRole;

/**
 * Service layer to authenticate user against the defined role.
 * @author Sandeep Bindra
 *
 */
public class AuthServiceProvider implements UserDetailsService {

	static {
		List<GrantedAuthority> roleList = new ArrayList<GrantedAuthority>();
		EnumSet<UserRole> allRoles = EnumSet.allOf(UserRole.class);
		for (UserRole role : allRoles) {
			roleList.add(new SimpleGrantedAuthority(role.toString()));
		}

	}

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {

		/*
		 * Users user = authService.getUser(username);
		 * 
		 * if (user != null) { Set<UserRoles> roles = user.getUserRoleses();
		 * 
		 * return new User(user.getUsername(), user.getPassword(), true, true,
		 * true, true, getAuthority(roles)); }
		 */

		return null;
	}

}

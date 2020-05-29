/*package com.bfwg.service.impl;

import java.io.FileReader;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.bfwg.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;

*//**
 * Created by fan.jin on 2016-10-31.
 *//*

@Service
public class CustomUserDetailsService implements UserDetailsService {

	protected final Log LOGGER = LogFactory.getLog(getClass());

	
	 * @Autowired private UserRepository userRepository;
	 
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// User user = userRepository.findByUsername(username);
		User userJson =null;
		try {
			User[] users = null;
			
			FileReader reader = null;
			//reader = new FileReader("D:\\backendjava\\Allprojects\\jsonfiles\\auth1.json");
			Resource resource = new ClassPathResource("/auth1.json");
			reader = new FileReader(resource.getFile());
			ObjectMapper mapper = new ObjectMapper();
			users = mapper.readValue(reader, User[].class);
			for (User user : users) {
				if (user.getUsername().equals(username)) {
					userJson = user;
				}
			}
			if (users == null) {
				throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
			}
		} catch (Exception e) {
			throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
		}
		return userJson;
	}

	public void changePassword(String oldPassword, String newPassword) {

		Authentication currentUser = SecurityContextHolder.getContext().getAuthentication();
		String username = currentUser.getName();

		if (authenticationManager != null) {
			LOGGER.debug("Re-authenticating user '" + username + "' for password change request.");

			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, oldPassword));
		} else {
			LOGGER.debug("No authentication manager set. can't change Password!");

			return;
		}

		LOGGER.debug("Changing password for user '" + username + "'");

		User user = (User) loadUserByUsername(username);

		user.setPassword(passwordEncoder.encode(newPassword));

		// userRepository.save(user);

	}

}
*/
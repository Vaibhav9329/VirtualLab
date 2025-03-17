package com.vlab.virtualLab.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.vlab.virtualLab.dto.UserDTO;
import com.vlab.virtualLab.model.User;
import com.vlab.virtualLab.repository.UserRepository;

@Service
public class UserService {

	  private final UserRepository userRepository;
	    private final BCryptPasswordEncoder passwordEncoder;


	    public UserService(UserRepository userRepository) {
	        this.userRepository = userRepository;
	        this.passwordEncoder = new BCryptPasswordEncoder();
	    }
	    

	    public String registerUser(UserDTO userDTO) {
	        // Check if email is already registered
	        if (userRepository.findByEmail(userDTO.getEmail()).isPresent()) {
	            throw new RuntimeException("Email already registered");
	        }
	        // Create new user
	        User user = new User();
	        user.setEmail(userDTO.getEmail());
	        user.setPassword(passwordEncoder.encode(userDTO.getPassword())); // Encrypt password
	        user.setRole("STUDENT");

	        userRepository.save(user);

	        return "User registered successfully";
	    }
}

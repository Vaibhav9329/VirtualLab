package com.vlab.virtualLab.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vlab.virtualLab.dto.UserDTO;
import com.vlab.virtualLab.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	 private final UserService userService;

	    public UserController(UserService userService) {
	        this.userService = userService;
	    }
	    
	    @PostMapping("/register")
	    public ResponseEntity<String> registerUser(@RequestBody UserDTO userDTO) {
	        String result = userService.registerUser(userDTO);
	        return ResponseEntity.ok(result);
	    }
}

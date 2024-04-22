package com.example.UserService.Controller;

import java.sql.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.UserService.Entity.User;



public interface UserController {

	@PostMapping("/createUser")
	public String createUser(@RequestBody User user);

	@PostMapping("/updateUser")
	public User updateUser(@RequestParam Long id, @RequestBody User updateUser)throws Exception;

	@GetMapping("/getUsersById")
	public ResponseEntity<?> getUsers(@RequestParam Long id);

	@GetMapping("/getUserByDate")
	public List<User> getUsersBetweenDates(@RequestParam Date startDate, @RequestParam Date endDate);

	@PostMapping("/deleteUser")
	public ResponseEntity<String> deleteUser(@RequestParam Long id);

	@GetMapping("/getUsers")
	public List<User> getAllUsers();

}

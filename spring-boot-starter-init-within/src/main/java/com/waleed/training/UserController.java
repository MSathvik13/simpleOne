package com.waleed.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class UserController {
	
	ArrayList<User> listOfUsers = new ArrayList<>(
			Arrays.asList(
					new User(45, "Rethasi", "Bangalore"),
					new User(46, "Manish", "Pune, India"),
					new User(12, "Mamatha", "Bangalore")
						)
			);
	
//	Gets all users
	@RequestMapping("/users")
	List<User> getUsers() {
		return listOfUsers;
	}
	

	
//	Adds a new User
	@RequestMapping(method = RequestMethod.POST, value =  "/users")
	void addUser(@RequestBody User user) {
		listOfUsers.add(user);
	}
	
// Update User
	@RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
	void updateUser(@PathVariable Integer id, @RequestBody User user) {
		for(User ref : listOfUsers) {
			if(ref.getUserId() == id)
				listOfUsers.set(listOfUsers.indexOf(ref), user);
		}
	}
	

//	Delete User
	@RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
	void deleteUser(@PathVariable Integer id) {
		User temp = null;
		
		for(User ref : listOfUsers) {
			if(ref.getUserId() == id) {
				temp = ref;
				break;
			}
		}
		
		listOfUsers.remove(listOfUsers.indexOf(temp));
	}
	
	
	
	
	

}

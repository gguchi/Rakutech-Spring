package com.RakutechApplication.Controllers;

import com.RakutechApplication.model.User;
import com.RakutechApplication.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;


@Controller
public class UserController {

    private  UserRepository userRepository;
    private final Logger log = LoggerFactory.getLogger(UserController.class);

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/register")
    public String register(){

        return "register.html";

    }

    @RequestMapping("/login")
    public String login(){

        return "login.html";

    }

    @PostMapping("/user")
    ResponseEntity<User> createCustomer(@RequestBody User user) throws URISyntaxException {
        log.info("Request to create customer: {}", user);
        User result = userRepository.save(user);
        return ResponseEntity.created(new URI("/api/group/" + result.getId()))
                .body(result);
    }

    @PutMapping("/user")
    ResponseEntity<User> updateGroup(@RequestBody User user) {
        log.info("Request to update customer: {}", user);
        User result = userRepository.save(user);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> deleteCustomer(@PathVariable Long id) {
        log.info("Request to delete customer: {}", id);
        userRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

}

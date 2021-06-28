package com.RakutechApplication.Controllers;

import com.RakutechApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {


    @RequestMapping("/register")
    public String register(){

        return "register.html";

    }

    @RequestMapping("/login")
    public String login(){

        return "login.html";

    }

}

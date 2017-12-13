package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class LoginController {

    @RequestMapping(value = "/loggedin")
    public String loginPage(@Valid @ModelAttribute("cred") Credentials credentials, BindingResult theBindingResult){


        System.out.println("|"+credentials.getPassword()+"|");

        if (theBindingResult.hasErrors()) {
            return "homepage";
        } else if (credentials.getUsername().startsWith("T")) {
            return "menuTeacher";
        } else
            return "menuStudent";
    }

}

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

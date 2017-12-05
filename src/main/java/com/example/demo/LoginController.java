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

    @RequestMapping(value = "/loggedin", method = RequestMethod.POST)
    public String loginPage(@RequestParam String login,
                            ModelMap model) {

        if (login.startsWith("T")) {
            return "menuTeacher";
        } else if(login.startsWith("S")) {
            return "menuStudent";
        } else {
            model.put("errormsg", "wrong password or username!");
            return "homepage";
        }
    }

}

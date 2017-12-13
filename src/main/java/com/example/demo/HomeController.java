package com.example.demo;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController {

    @RequestMapping("/")
        public String hello(Model model){

            Credentials credentials = new Credentials();

            model.addAttribute("cred",credentials);

            return "homepage";
        }

}

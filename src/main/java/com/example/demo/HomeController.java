package com.example.demo;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
public class HomeController {

    @RequestMapping("/")
        public String hello(Model model){

            Credentials credentials = new Credentials();

            model.addAttribute("cred",credentials);

            return "homepage";
        }

    @InitBinder/* Converts empty strings into null when a form is submitted */
    public void initBinder(WebDataBinder binder) {

        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class, stringTrimmerEditor);

    }

}

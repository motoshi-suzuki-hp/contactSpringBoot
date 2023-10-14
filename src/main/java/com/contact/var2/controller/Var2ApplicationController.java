package com.contact.var2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// import org.springframework.web.servlet.ModelAndView;

@Controller
public class Var2ApplicationController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/confirm-message")
    private String confirmMessage(@RequestParam String message, String name, String mail, Model model){
        model.addAttribute("name", name);
        model.addAttribute("mail", mail);
        model.addAttribute("message", message);
        return "confirmMessage";

        // return repository.save(name);
        // return repository.save(mail);
        // return repository.save(message);


    }
    
}

package com.TaylorAcent.TaylorScentProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class PessoasControllers {
    @GetMapping
   public String showHomePage(){
       return "home/index";
   }
}

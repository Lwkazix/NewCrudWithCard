package com.TaylorAcent.TaylorScentProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/home")
public class PessoasControllersReplace {

    @GetMapping(value = "/perfumes")
    public String changePage(){
        return "scent/scent";
    }
}

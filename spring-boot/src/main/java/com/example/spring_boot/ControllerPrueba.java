package com.example.spring_boot;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class ControllerPrueba{
    @GetMapping("/hola")
    public String hola(){
        return String.format("Hola");
    }


    @GetMapping("/HolaMundo")
    public String holaMundo(Model model){

        model.addAttribute("nombre","UTN");
        return String.format("Hola Mundo!, estudio en la: " + model.getAttribute("nombre"));
    }


}

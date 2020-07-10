package com.pavani.springboot.pavanijava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    Model model;


    @GetMapping("/test1")
    public Model test1(@RequestParam(value="Pavani") String Pavani){

        //Model model = new Model();
        model.setId(101);
        model.setName("Poli");
        return model;
    }

}

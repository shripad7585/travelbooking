package com.example.travelbookingms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Train {
    @GetMapping("/mytrain")
    public String getdata(){
        return "Please book your Train ticket";

    }
}



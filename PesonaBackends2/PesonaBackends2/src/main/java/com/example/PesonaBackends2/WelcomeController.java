package com.example.PesonaBackends2;

import org.springframework.data.repository.cdi.Eager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")

    public String welcome(){
        return "Welcome";
    }


}

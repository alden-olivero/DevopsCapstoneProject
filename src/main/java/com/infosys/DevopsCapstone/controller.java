package com.infosys.DevopsCapstone;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@GetMapping("/")
    public String sayHello() {
        return "Hello This is a Capston Project By Alden";
    }
    
}
package com.example.snowman;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controllers {

    private final myfile myfile;

    Controllers(myfile myfile) {
        this.myfile = myfile;
    }

    @GetMapping("/something")
    public String getMethodName() {
        return "WOW";
    }

    @GetMapping("/greetUser/{Name}")
    public String getMethodName(@PathVariable String Name) {
return myfile.greetUser(Name);    }
    
    
    @GetMapping("/somethings")
    public String getMethodNames() {
        return "WOW";
    }

    @GetMapping("/soma")
    public String getMethodNamess() {
       return myfile.newLife();
    }

    @PostMapping("/buildSnowman")
    public String postMethodName(@Valid @RequestBody Snowman snowman) {
        return myfile.evaluateSnowman(snowman);
        
    }
    
    
}

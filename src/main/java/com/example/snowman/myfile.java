package com.example.snowman;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class myfile {
    
    private final SnowmanRepository repository;

    public myfile(SnowmanRepository repository) {
        this.repository = repository;
    }

    @Bean
    public String newLife(){
        System.out.println("Exist for Humanity");
        return "Exist for Humanity";
    }

    public String greetUser(String Name){
        return "Hello, "+Name+"!";
    }

    public String evaluateSnowman(Snowman snowman){
        // Save to Database!
        Snowman savedSnowman = repository.save(snowman);
        
        if(Boolean.TRUE.equals(savedSnowman.getHasHat())){
            return savedSnowman.getName() + " is true and SAVED with ID: " + savedSnowman.getId();
        } else {
            return savedSnowman.getName() + " is false and SAVED with ID: " + savedSnowman.getId();
        }
    }
}

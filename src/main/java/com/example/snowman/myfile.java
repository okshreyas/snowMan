package com.example.snowman;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class myfile {
    
    @Bean
    public String newLife(){
        System.out.println("Exist for Humanity");
        return "Exist for Humanity";
    }

    public String greetUser(String Name){
        return "Hello, "+Name+"!";
    }

    public String evaluateSnowman(Snowman snowman){
        if(Boolean.TRUE.equals(snowman.getHasHat())){
            return snowman.getName() + " is true ";
        } else {
            return snowman.getName() + " is false ";
        }
    }
}

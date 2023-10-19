package com.cognizant.Greeting;
import org.springframework.stereotype.Service;
@Service
public class greetingservice {
    //create a method to return a greeting message
    public String greet(String name){
        return  "hello I am "+name;
    }
}

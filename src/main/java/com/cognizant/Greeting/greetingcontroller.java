package com.cognizant.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

@RestController

public class greetingcontroller {
    @GetMapping("/hello")
    public String sayHello(){
        return "Welcome";
    }
    //create the object of the service class
    greetingservice greetingService = new greetingservice();
   //post method to tale a name from url and return a greeting message
    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name){
        return greetingService.greet(name);
    }
    //get method to return a bye message
    @GetMapping("/bye")
    public String sayBye(){
        return "Bye";
    }

}

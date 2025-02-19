package com.example.adp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // we specify the URL because we want the method to respond to.
    @GetMapping("/")
    public String hello() {
        return "hello world!";
    }
    @GetMapping("/helloagain")
    public String[] helloAgain() {
        return new String[] { "hello world!", "again", "hang on what's this?" };
    }
    @GetMapping("/pojo/{first}/{last}/{id}")
    public MyPOJO myPojo( @PathVariable("first") String firstName,
                          @PathVariable("last") String lastName,
                          @PathVariable("id") int idNumber) {
        return new MyPOJO(firstName, lastName, idNumber);
    }




}

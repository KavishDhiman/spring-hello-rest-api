package com.bridgelabz.hello.controller;

import com.bridgelabz.hello.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    // UC1
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    // UC2
    @GetMapping("/hello/query")
    public String helloQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    // UC3
    @GetMapping("/hello/param/{name}")
    public String helloParam(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    // UC4
    @PostMapping("/hello/post")
    public String helloPost(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
    //UC5
    @PutMapping("/hello/put/{firstName}")
    public String helloPut(@PathVariable String firstName,
                           @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
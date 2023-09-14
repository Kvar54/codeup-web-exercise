package edu.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {


    @RequestMapping("/hello")

    @GetMapping("/world")
    @ResponseBody
    public String helloWorld() {
        System.out.println("inside HelloController helloWorld method");
        return "Hello,World!";
    }


    @GetMapping("/hello/{name}")
    @ResponseBody
    public String helloName(@PathVariable String name) {
        return String.format("hello, %s!", name);
//        return "Hello, " + name + "!";
    }

}

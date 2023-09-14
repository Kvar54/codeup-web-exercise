package edu.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {


    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody
    public String AddingNumbers(@PathVariable int num1, @PathVariable int num2) {
        int Add = Math.abs(num1 + num2);
        return String.valueOf(Add);
    }

    @GetMapping("/subtract/{num1}/from/{num2}")
    @ResponseBody

    public String subtractingNumbers(@PathVariable int num1, @PathVariable int num2) {
        int subtract = Math.abs(num1 - num2);
        return String.valueOf(subtract);
    }
    @GetMapping("/multiply/{num1}/and/{num2}")
    @ResponseBody
    public String multiplyingNumbers(@PathVariable int num1, @PathVariable int num2) {
        int multiply = Math.abs(num1 * num2);
        return String.valueOf(multiply);
    }

    @GetMapping("/divide/{num1}/by/{num2}")
    @ResponseBody
    public String dividingNumbers(@PathVariable int num1, @PathVariable int num2) {
        int divide = Math.abs(num1/num2);
        return String.valueOf(divide);
    }
}

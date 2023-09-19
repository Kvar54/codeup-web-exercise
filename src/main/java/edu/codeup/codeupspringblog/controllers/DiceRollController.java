package edu.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Controller
public class DiceRollController {
    @GetMapping("/roll-dice/")
    public String rollDice() {
        return "dice-roll";
    }

    @GetMapping("/roll-dice/{n}")
    public String randomRoll(@PathVariable int n, Model model) {
        int rand_int = ThreadLocalRandom.current().nextInt(1, 7);
        int rand_int2 = ThreadLocalRandom.current().nextInt(1, 7);
        int rand_int3 = ThreadLocalRandom.current().nextInt(1, 7);
        int rand_int4 = ThreadLocalRandom.current().nextInt(1, 7);
        int rand_int5 = ThreadLocalRandom.current().nextInt(1, 7);
        int rand_int6 = ThreadLocalRandom.current().nextInt(1, 7);

        List<Integer> diceRolls = new ArrayList<Integer>();
        diceRolls.add(rand_int);
        diceRolls.add(rand_int2);
        diceRolls.add(rand_int3);
        diceRolls.add(rand_int4);
        diceRolls.add(rand_int5);


//        if (rand_int == n) {
//            model.addAttribute("match", "It's a match");
//
//        } else {
//            model.addAttribute("match", "This is not a match");
//        }
        int bucket = 0;
        for(var i = 0; i <diceRolls.size(); i++){
            if(n == diceRolls.get(i)){
                bucket++;
            }
        }

        model.addAttribute("choice", "n");
        model.addAttribute("result", "rand_int");
        model.addAttribute("result", "Your Dice Matched: " + bucket);

        return "dice-roll";

    }
}

//        int number1 = (int) (Math.random() * 6) + 1;
//        int number2 = (int) (Math.random() * 6) + 1;
//        int number3 = (int) (Math.random() * 6) + 1;
//        int number4 = (int) (Math.random() * 6) + 1;
//        int number5 = (int) (Math.random() * 6) + 1;
//        int number6 = (int) (Math.random() * 6) + 1;








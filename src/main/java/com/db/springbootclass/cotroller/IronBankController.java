package com.db.springbootclass.cotroller;

import com.db.springbootclass.service.CustomerService;
import com.db.springbootclass.service.PredictionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/iron-bank")
public class IronBankController {
    private final CustomerService customerService;
    private final PredictionService predictionService;

    @GetMapping("/loan")
    public String howMuchIncome(@RequestParam("name") String name, @RequestParam("amount") int amount){
        return predictionService.willSurviveThisWinter(name) && customerService.howMuchIncome(name) > amount
                ? "loan was accepted"
                : "loan was rejected";

    }
}

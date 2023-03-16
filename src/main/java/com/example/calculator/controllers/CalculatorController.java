package com.example.calculator.controllers;

import com.example.calculator.services.CalculationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculator")
public class CalculatorController {

    private final CalculationService calculationService;

    public CalculatorController(CalculationService calculationService){
        this.calculationService = calculationService;
    }

    @GetMapping("/")
    public String getGreeting() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("plus")
    public String getPlus(@RequestParam(required = false) String num1,
                          @RequestParam(required = false) String num2) {
        String x = "+";
        return calculationService.calculate(num1, num2, x);
    }

    @GetMapping("minus")
    public String getMinus(@RequestParam(required = false) String num1,
                           @RequestParam(required = false) String num2) {
        String x = "-";
        return calculationService.calculate(num1, num2, x);
    }

    @GetMapping("multiply")
    public String getMultiply(@RequestParam(required = false) String num1,
                              @RequestParam(required = false) String num2) {
        String x = "*";
        return calculationService.calculate(num1, num2, x);
    }

    @GetMapping("divide")
    public String getDivide(@RequestParam(required = false) String num1,
                            @RequestParam(required = false) String num2) {
        String x = "/";
        return calculationService.calculate(num1, num2, x);
    }

}



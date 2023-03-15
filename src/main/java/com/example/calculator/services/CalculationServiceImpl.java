package com.example.calculator.services;

import org.springframework.stereotype.Service;

@Service
public class CalculationServiceImpl implements CalculationService{

    @Override
    public Integer calculate(String num1, String num2, String x) {

        return switch (x){
            case "+" -> Integer.parseInt(num1)+Integer.parseInt(num2);
            case "-" -> Integer.parseInt(num1)-Integer.parseInt(num2);
            case "*" -> Integer.parseInt(num1)*Integer.parseInt(num2);
            default -> null;
        };
    }

    public double divide(String num1, String num2, String x) {
        return Double.parseDouble(num1)/Double.parseDouble(num2);
    }

}


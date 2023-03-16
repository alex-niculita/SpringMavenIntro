package com.example.calculator.services;

import org.springframework.stereotype.Service;

@Service
public class CalculationServiceImpl implements CalculationService{

    @Override
    public String calculate(String num1, String num2, String x) {
        if ((x.equals("/")) && (num2.equals("0"))) return "Ошибка: делить на ноль нельзя!";

        if ((num1 == null) || (num2 == null)) return "Ошибка: не хватает чисел!";

        return switch (x){
            case "+" -> String.format("%s %s %s = %d", num1, x, num2, Integer.parseInt(num1)+Integer.parseInt(num2));
            case "-" -> String.format("%s %s %s = %d", num1, x, num2, Integer.parseInt(num1)-Integer.parseInt(num2));
            case "*" -> String.format("%s %s %s = %d", num1, x, num2, Integer.parseInt(num1)*Integer.parseInt(num2));
            case "/" -> String.format("%s %s %s = %.2f", num1, x, num2, Double.parseDouble(num1)/Double.parseDouble(num2));
            default -> "Ошибка: что то пошло не так!";
        };

    }

}


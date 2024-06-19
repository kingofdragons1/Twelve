package org.example;

public class Divider implements Operation {
    @Override
    public double getResult(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Ошибка: деление на ноль!");
            return Double.NaN; // Возвращаем NaN (Not-a-Number) в случае деления на ноль
        }
    }
}
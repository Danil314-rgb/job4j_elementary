package ru.job4j;
import static ru.job4j.math.MathFunction.*;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Результат расчёта sumMultiply равен: " + sumMultiply(20, 20));
        System.out.println("Результат расчёта sumMinusDivision равен: " + sumMinusDivision(20, 10));
        System.out.println("Результат расчёта sumAllOperation равен: " + sumAllOperation(30, 20));
    }
    public  static  double sumMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public  static  double sumMinusDivision(double first, double second) {
        return  minus(first, second) + division(first, second);
    }

    public  static  double sumAllOperation(double first, double second) {
        return  sum(first, second) + multiply(first, second) + minus(first, second) + division(first, second);
    }

}

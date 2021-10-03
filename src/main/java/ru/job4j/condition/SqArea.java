package ru.job4j.condition;

public class SqArea {
    public static void main(String[] args) {

        double result1 = SqArea.area(2, 2, 2);
        System.out.println("result1 = " + result1);
    }

    public static double area(double a, double b, double c) {
        double pPr = (a + b + c) / 2;
        double rsl = Math.sqrt(pPr * (pPr - a) * (pPr - b) * (pPr - c));
        return rsl;
    }
}

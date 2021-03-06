package ru.job4j.condition;

public class Point {

    public static void main(String[] args) {
        double result1 = Point.distance(0, 4, 2, 5);
        System.out.println("result1 (0, 4) to (2, 5): " + result1);
        double result2 = Point.distance(0, 2, 0, 1);
        System.out.println("result2 (0, 2) to (0, 1): " + result2);
        double result3 = Point.distance(1, 0, 2, 0);
        System.out.println("result3 (1, 0) to (2, 0): " + result3);
        double result4 = Point.distance(1, 2, 3, 4);
        System.out.println("result4 (1, 2) to (3, 4): " + result4);
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((Math.pow((y2 - y1), 2) + Math.pow((x2 - x1), 2)));
    }
}

package ru.job4j.condition;

public class Point {
    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        System.out.println("result1 (0, 0) to (2, 0): " + result1);

        double result2 = Point.distance(0, 4, 2, 5);
        System.out.println("result2 (0, 0) to (2, 0): " + result2);
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        double rs1 = (x2 - x1);
        double rs2 = Math.pow(rs1, 2);

        double rs3 = (y2 - y1);
        double rs4 = Math.pow(rs3, 2);

        double rs5 = rs2 + rs4;
        double rs6 = Math.sqrt(rs5);
        return  rs6;
    }
}

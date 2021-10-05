package ru.job4j;

public class Main {

    public static void main(String[] args) {
        System.out.println(mod(12));

    }

    public static int mod(int num) {

        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
}
package ru.job4j.converter;

public class Converter {
    public static void main(String[] args) {
        /*float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");*/

        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result: " + passed);

        float input = 180;
        float result = 3;
        float output = Converter.rubleToDollar(input);
        boolean compare = result == output;
        System.out.println("180 rubles are 3. Test result: " + compare);
    }

    public  static float rubleToEuro(float value) {
        return value / 70;
    }

    public  static float rubleToDollar(float value) {
        return value / 60;
    }

}

package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void man178Weight89_6() {
        short manWeight = 178;        // вход
        double expected = 89.6;       // ожидаемый результат
        double out = Fit.manWeight(manWeight); // выход
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void woman156Weight64_3() {
        short womenWeight = 156;
        double expected = 52.9;
        double out = Fit.womanWeight(womenWeight);
        Assert.assertEquals(expected, out, 0.1);
    }
}
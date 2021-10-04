package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when04to25then2_3() {
        int x1 = 0;
        int y1 = 4;
        int x2 = 2;
        int y2 = 5;

        double result = 2.3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(result, out, 0.1 );
    }

    @Test
    public void when02to01then1() {
        int x1 = 0;
        int y1 = 2;
        int x2 = 0;
        int y2 = 1;

        double result = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(result, out, 0.1);
    }

    @Test
    public void when10to20then1() {
        int x1 = 1;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;

        double result = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(result, out, 0.1 );
    }

    @Test
    public void when12to34then2_8() {
        int x1 = 1;
        int y1 = 2;
        int x2 = 3;
        int y2 = 4;

        double result = 2.8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(result, out, 0.1 );
    }
}
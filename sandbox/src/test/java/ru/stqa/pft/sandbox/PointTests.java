package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
    @Test
    public void testDistance0() {
        Point p1 = new Point(2, 5);
        Point p2 = new Point(1, 10);
        assert p1.distance(p2) >= 0;
    }
    @Test
    public void testDistance1() {
        Point p1 = new Point(2, 5);
        Point p2 = new Point(1, 10);
        Assert.assertEquals(p1.distance(p2),5.0990195135927845);
    }
    @Test
    public void testDistance2() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 0);
        Assert.assertEquals(p1.distance(p2),0);
    }
    @Test
    public void testDistance3() {
        Point p1 = new Point(- 1, 2);
        Point p2 = new Point(- 1, - 2);
        Assert.assertEquals(p1.distance(p2),4);
    }
    @Test
    public void testDistance4() {

        Point p1 = new Point(0, 2);
        Point p2 = new Point(- 1.9999, 0.000001);
        Assert.assertEquals(p1.distance(p2),2.8283557078276065);
    }
}

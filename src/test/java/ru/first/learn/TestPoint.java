package ru.first.learn;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class TestPoint {

    @Test
    public void longOfPoint() {
        Point p1 = new Point(0, 1);
        Point p2 = new Point(0, 13);

        Assert.assertEquals(p1.distanceInClass(p2), 12.0, "Что-то не так");
        System.out.println("Тест прошел успешно");
    }

    @Test
    public void longOfPointTwo() {
        Point p1 = new Point(1, 5);
        Point p2 = new Point(2, 12);

        double proverka = home2.distance(p1, p2);
        double formula = p1.distanceInClass(p2);

        Assert.assertEquals(formula, proverka, "Усп значения не совпали");
        System.out.println("Формула = " + formula);
        System.out.println("Проверочный ответ = " + proverka);
    }

    @Test
    public void longOfPointThree() {
        Point p1 = new Point(-2, -3);
        Point p2 = new Point(p1.x + 8, p1.y - 11);

        double f = home2.distance(p1, p2);

        Assert.assertTrue(f > 0);
    }
}

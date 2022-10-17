package ru.first.learn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPoint {

    @Test
    public void longOfPoint() {
        Point p1 = new Point(0, 1);
        Point p2 = new Point(0, 13);

        Assertions.assertEquals(p1.distanceInClass(p2), 12, "Что-то не так");
        System.out.println("Тест прошел успешно");
    }

    @Test
    public void testArea1() {
        Point p1 = new Point(1, 5);
        Point p2 = new Point(2, 12);

        System.out.println("Заведомо провальный тест");

        double o = Math.random() * 10;

        Assertions.assertEquals(Math.floor(p1.distanceInClass(p2)), Math.floor(o), "С округлением вниз значения не совпали");
        Assertions.assertEquals(p1.distanceInClass(p2), o, "Усп значения не совпали");
    }
}

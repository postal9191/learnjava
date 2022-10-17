package ru.first.learn;

public class home2 {

    public static void main(String[] args) {

        Point p1 = new Point(1, 6);
        Point p2 = new Point(10, 12);

        System.out.println("Расстояние с помощью функции = " + distance(p1, p2));
        System.out.println("Расстояние с помощью метода из класса Point = " + p1.distanceInClass(p2));
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
    }
}

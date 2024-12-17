package org.example;

import geometry2d.*;
import geometry3d.*;
import exceptions.InvalidArgumentException;
import exceptions.InvalidHeightException;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        Button button = new Button();
        button.touch();
        button.touch();
        button.touch();

        // Задание 2
        Balance scales = new Balance();
        scales.addLeft(15);
        scales.addRight(25);
        scales.result();
        scales.addLeft(20);
        scales.result();

        // Задание 3
        Bell bell = new Bell();
        bell.sound();

        // Задание 4
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(1);
        separator.addNumber(2);
        separator.addNumber(3);
        separator.addNumber(4);
        separator.addNumber(5);
        System.out.println(separator.getOddList());
        System.out.println(separator.getEvenList());

        // Задание 5
        Table table = new Table(2, 2);
        table.setValue(0, 0, 1);
        table.setValue(0, 1, 2);
        table.setValue(1, 0, 3);
        table.setValue(1, 1, 4);
        System.out.println(table.getValue(0, 0));
        System.out.println(table.rows());
        System.out.println(table.cols());
        System.out.println(table.average());
        System.out.println(table);

        // Задание 6
        try {
            Circle circle = new Circle(3);
            circle.area();
            circle.perimeter();
            System.out.println(circle);

            Rectangle rectangle = new Rectangle(4, 5);
            rectangle.area();
            rectangle.perimeter();
            System.out.println(rectangle);

            Cylinder cylinder = new Cylinder(circle, 5);
            System.out.println(cylinder.volume());
            System.out.println(cylinder);

        } catch (InvalidHeightException | InvalidArgumentException message) {
            System.out.println(message.getMessage());
        }
    }
}

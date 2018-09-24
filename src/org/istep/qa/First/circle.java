package org.istep.qa.First;

import java.util.Scanner;

public class circle {
    public String colorCircle;
    public int radiusCircle, diamertCircle;
    double area;
    Scanner scanner = new Scanner(System.in);

    public void printcolorCircleToConsole() {
        System.out.println(colorCircle);
    }

    public void razmerTriangl() {
        System.out.println("Введи радиус " + colorCircle + " круга");
        radiusCircle = scanner.nextInt();
        diamertCircle = radiusCircle * 2;
        area = (radiusCircle * 3.14) * 2;
        System.out.println("Диаметр круга " + colorCircle + " = " + diamertCircle);
        System.out.println("Площадь круга " + colorCircle + " = " + area);
    }
}

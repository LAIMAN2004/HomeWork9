package org.istep.qa.Secand;

import org.istep.qa.First.circle;

public class result {

    public static void main(String[] args) {
        circle circleOne = new circle();
        circleOne.colorCircle = "Зеленый";
        circleOne.printcolorCircleToConsole();
        circleOne.razmerTriangl();

        circle circleTwo = new circle();
        circleTwo.colorCircle = "Синий";
        circleTwo.printcolorCircleToConsole();
        circleTwo.razmerTriangl();
        if (circleOne.diamertCircle > circleTwo.diamertCircle) {
            System.out.println("Прервый круг больше");
        } else {
            System.out.println("Второй круг больше");
        }
    }
}


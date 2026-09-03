package application;
import entities.Triangle;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("MEDIDAS DO TRIANGULO A: ");
        x.a =  input.nextDouble();
        x.b = input.nextDouble();
        x.c = input.nextDouble();
        System.out.println("MEDIDAS DO TRIANGULO B: ");
        y.a =  input.nextDouble();
        y.b = input.nextDouble();
        y.c = input.nextDouble();

        double pX = (x.a + x.b + x.c)/2;
        double pY = (y.a + y.b + y.c)/2;

        double areaX = Math.sqrt (pX * (pX-x.a) * (pX-x.b) * (pX-x.c));
        double areaY = Math.sqrt (pY * (pY-y.a) * (pY-y.b) * (pY-y.c));

        System.out.println("AREA X: " + areaX);
        System.out.println("AREA Y: " + areaY);

        if  (areaX > areaY) {
            System.out.println("TRIANGULO A É MAIOR ");
        }
        else if (areaX < areaY) {
            System.out.println("TRIANGULO B É MAIOR");
        }else {
            System.out.println("IGUAIS");
        }

    }
}

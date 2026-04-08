package com.guilherme.app;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double Xa, Xb, Xc, Ya, Yb, Yc;

        System.out.println("Medidas triangulo X: ");
        Xa = input.nextDouble();
        Xb = input.nextDouble();
        Xc = input.nextDouble();

        System.out.println("Medidas triangulo Y: ");
        Ya = input.nextDouble();
        Yb = input.nextDouble();
        Yc = input.nextDouble();

        double p1 = (Xa + Xb + Xc) / 2;
        double area1 = Math.sqrt(p1 * (p1 - Xa) * (p1 - Xb) * (p1 - Xc));

        double p2 = (Ya + Yb + Yc) / 2;
        double area2 = Math.sqrt(p2 * (p2 - Xa) * (p2 - Xb) * (p2 - Xc));

        System.out.println("Area 1: " + area1);
        System.out.println("Area 2: " + area2);

    }
}

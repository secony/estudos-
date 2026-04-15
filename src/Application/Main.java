package Application;

import Entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static final double PI = 3.14;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio: ");
        double raio = sc.nextDouble();

        double c = circunferencia(raio);
        double v = volume(raio);

        System.out.println(c);
        System.out.println(v);
        System.out.println(PI);

        sc.close();
    }

    public static double circunferencia(double raio) {
        return raio * 2 * PI;
    }
    public static double volume(double raio) {
        return (4 * PI * Math.pow(raio, 3) ) / 3;
    }
}
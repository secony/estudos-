
package application;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n  = sc.nextInt();

        String[] nome = new String[n];
        int [] idade = new int [n];
        double[] altura = new double[n];

        for  (int i = 0; i < n; i++) {
            System.out.println("Digite o nome da pessoa " + (i+1) + ":");
            nome[i] = sc.next();
            System.out.println("Digite a idade: ");
            idade[i] = sc.nextInt();
            System.out.println("Digite a altura: ");
            altura[i] = sc.nextDouble();
        }
        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += altura[i];
        }
        double media = sum/n;

        System.out.println(media);
    }

}
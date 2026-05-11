
package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nomes da pessoa " + (i + 1) + ":");
            nomes[i] = sc.next();
            System.out.println("Digite a idade: ");
            idades[i] = sc.nextInt();
            System.out.println("Digite a altura: ");
            alturas[i] = sc.nextDouble();
        }
        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += alturas[i];
        }
        double media = sum / n;

        int pessoasMenor16 = 0;
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                pessoasMenor16++;
            }
        }

        System.out.println("Pessoas menor de 16: " + pessoasMenor16);
        System.out.println("media: "+ media);
    }

}
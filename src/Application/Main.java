
package Application;
import entities.Cotacao;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cotacao cotacao = new Cotacao();

        System.out.println("Valor do dolar: ");
        cotacao.dolarPrice = input.nextDouble();

        System.out.println("Quantos dolares: ");
        cotacao.dolarQuant = input.nextDouble();

        System.out.println("Valor do reais: "+ cotacao.convercao(cotacao.dolarPrice, cotacao.dolarQuant, cotacao.reais));


    }
}
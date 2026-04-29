
package application;

import entities.Product;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de produtos: ");
        int quantidade = input.nextInt();

        Product[] products = new Product[quantidade];

        for (int i = 0; i < products.length; i++) {
            System.out.print("Digite o nome do produto: ");
            String nome = input.next();

            System.out.print("Digite o preço: ");
            double price = input.nextDouble();
            products[i] = new Product(nome,price);
        }

        double soma= 0;

        for (int i = 0; i < products.length; i++) {
            soma += products[i].getPrice();

        }
        double media = soma/products.length;

        System.out.println("media: "+media);
    }
}
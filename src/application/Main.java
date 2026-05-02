
package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.print("Quantas pessoas serao digitadas?: ");
        int pessoas = input.nextInt();

        String nomes [] = new String [pessoas];
        int idades [] = new int [pessoas];
        double altura [] = new double[pessoas];
        double media = 0;

        for(int i = 0; i < pessoas; i++){
            System.out.println("Dados da pessoa "+ (i+1) + " : ");
            System.out.print("nome : ");
            nomes[i] = input.next();
            System.out.print("idade : ");
            idades[i] = input.nextInt();
            System.out.print("altura : ");
            altura [i] = input.nextDouble();
        }

        for (int i = 0; i < pessoas; i++) {
            media = (media + altura [i]) ;
        }

        for (int i = 0; i < pessoas; i++) {


        }


        System.out.println("altura media: "+ media/pessoas);
    }
}
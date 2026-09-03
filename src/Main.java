
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite as medidas do triangulo A: ");
        double xa  = input.nextDouble();
        double ya = input.nextDouble();
        double za = input.nextDouble();

        System.out.println("Digite as medidas do triangulo B: ");
        double xb = input.nextDouble();
        double yb = input.nextDouble();
        double zb = input.nextDouble();

        double pa = (xa + ya + za)/ 2;
        double pb = (xb + yb + zb)/ 2;

        double areaA = Math.sqrt(pa* (pa-xa)*(pa-ya)*(pa-za));
        double areaB = Math.sqrt(pb* (pb-xb)*(pb-yb)*(pb-zb));

        System.out.println("Area do triangulo A: "+areaA);
        System.out.println("Area do triangulo B: "+areaB);

        if (areaA>areaB){
            System.out.println("A é maior");
        }else {
            System.out.println("B é maior ");
        }
}
}

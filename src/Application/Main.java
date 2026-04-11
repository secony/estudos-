package Application;

import Entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        String pass = "";
        double faltante = 0;

        System.out.println("Digite o nome do aluno: ");
        aluno.nome = sc.nextLine();
        System.out.println("Digite a nota do primeiro, segundo e terceriro bimestre: ");
        aluno.primeiroBi = sc.nextDouble();
        aluno.segundoBi = sc.nextDouble();
        aluno.terceiroBi = sc.nextDouble();

        System.out.println(aluno.notaAno());

        if (aluno.notaAno() < 60) {
            pass = "Reprovado";
            faltante = aluno.missingPoints();
            System.out.println(pass +"\nFaltou: " + faltante + " pontos.");
        }else {
            pass = "Aprovado";
            System.out.println(pass);
        }



        sc.close();
    }
}
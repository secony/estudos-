package Entities;

public class Aluno {

    public String nome;
    public double primeiroBi;
    public double segundoBi;
    public double terceiroBi;

    public double notaAno() {
        return primeiroBi + segundoBi + terceiroBi;
    }

    public Double missingPoints() {
        if (notaAno() > 60) {
            return 0.0;
        }else  {
            return 60 -  notaAno();
        }
    }

}

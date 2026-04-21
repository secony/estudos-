package entities;

public class Cotacao {

    public double dolarPrice = 0.0;
    public double dolarQuant = 0.0;
    public double reais = 0.0;

    public static double convercao(double dolarPrice, double dolarQuant, double reais) {
        reais = (dolarPrice + dolarPrice* 0.06) * dolarQuant;
        return reais;
    }
}
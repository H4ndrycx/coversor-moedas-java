package Uninter;

/*
 * Representa a moeda Dólar e define sua conversão para Reais
 */

public class Dolar extends Moeda {

    public Dolar(double valor) {
        super(valor);
        this.moedaNome = "Dolar";
        this.cotacao = 6.07;
    }
}

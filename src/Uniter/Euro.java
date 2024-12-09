package Uninter;

/*
 * Representa a moeda Euro e define sua conversão para Reais.
 */

public class Euro extends Moeda {
    public Euro(double valor) {
        super(valor);
        this.moedaNome = "Euro";
        this.cotacao = 6.00;
    }
}

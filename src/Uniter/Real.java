package Uninter;

/*
 * Representa a moeda Real. Já está na unidade base, então a conversão é direta.
 */

public class Real extends Moeda {
    public Real(double valor) {
        super(valor);
        this.moedaNome = "Real";
        this.cotacao = 1;
    }

    public void info() {
        System.out.println(
            String.format("%s - Valor: %s",
                this.moedaNome, this.valor)
        );
    }

}

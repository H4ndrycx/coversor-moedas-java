package Uninter;
/*Classe abstrata, que define o comportamento base de uma moeda.
 * Ela será recebida por classes específicas, como Dolar, Euro e Real.
 */
public abstract class Moeda {
	public double valor; //valor da moeda
	protected double cotacao; //valor da moeda
	protected String moedaNome; //nome da moeda

	//Recebe um valor no momento da criação da moeda.
	public Moeda( double valor) {
		this.valor = valor;
	}

    //Mostra informação específicas da moeda covertido. (ex.:moedaNome e valor)
    public void info() {
		System.out.println(
            String.format("%s - Valor: %s - Valor em Reais: %s",
                this.moedaNome, this.valor, this.converter())
        );
    }

    //Muda o valor da moeda para Reais.
	public double converter() {
		return valor * this.cotacao; // valor moeda + cotacao em reais
	}
}

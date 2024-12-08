package Uninter;

import java.util.ArrayList;

public class Cofrinho {

	private ArrayList<Moeda> listaMoedas; //Lista de moedas no cofrinho

	public Cofrinho() {
		this.listaMoedas = new ArrayList<Moeda>();

        // ids: Real: 0 , Dolar: 1, Euro: 3;
        this.listaMoedas.add(new Real(0));
        this.listaMoedas.add(new Dolar(0));
        this.listaMoedas.add(new Euro(0));
	}

	// Adicionar saldo no cofrinho, para uma moeda especifica
    // recebendo id da moeda e valor (double)
    // ids: Real: 0 , Dolar: 1, Euro: 3;
	public void adicionar(int moedaId, double valor) {
        double valorAnterior = this.listaMoedas.get(moedaId).valor;
        this.listaMoedas.get(moedaId).valor = valorAnterior + valor;
		System.out.println("Valor adicionado com sucesso.");
	}

	// Remove saldo no cofrinho, para uma moeda especifica
    // recebendo id da moeda e valor (double)
    // ids: Real: 0 , Dolar: 1, Euro: 3;
	public void remover(int moedaId, double valor) {
        double valorAnterior = this.listaMoedas.get(moedaId).valor;
        if (valorAnterior > valor) {
            this.listaMoedas.get(moedaId).valor = valorAnterior - valor;
            System.out.println("Valor removido com sucesso.");
        } else {
            System.out.println("Valor inválido.");
        }
	}


	public void listagemMoedas() {

		if(listaMoedas.isEmpty()) {
			System.out.println("O cofrinho está vazio.");

		}else {
				for(Moeda moeda : listaMoedas) {
					moeda.info(); //Chama o método info() de cada moeda
				}
			}
		}

   //Calcula o valor total convertido para Reais.
	public double totalConvertido() {
		double total = 0;
		for(Moeda moeda : listaMoedas) {
			total += moeda.converter();

		}
		return total;
	}
}

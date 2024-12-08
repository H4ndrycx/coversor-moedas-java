package Uninter;

import java.util.Scanner;

/*
 * A classe Principal contém o menu para interação com o usuário e utiliza as funcionalidades do Cofrinho.
 * - Adicionar moedas.
 * - Remover moedas.
 * - Listar moedas.
 * - Calcular o total em Reais.
 * - Sair do programa.
 */

public class Principal {

	public static void main(String[] args) {

		Cofrinho cofrinho = new Cofrinho();
		Scanner scanner = new Scanner(System.in); //Captura a entrada do usuário

		int opcao;

		do {
			//Exibe Menu
			System.out.println("\nCOFRINHO: ");
			System.out.println("1- Adicionar Moeda");
			System.out.println("2- Remover Moeda");
			System.out.println("3- Listar Moedas");
			System.out.println("4- Calcular total convertido para Real");
			System.out.println("0- Encerrar");
			System.out.println("Escolha uma opção: ");
			opcao = scanner.nextInt();

			//Processa as opções do menu:
			switch(opcao) {
			    case 1: //Adicionar moeda
			    	System.out.println("Escolha a Moeda: ");
			    	System.out.println("1- Real");
			    	System.out.println("2- Dolar");
			    	System.out.println("3- Euro");
			    	int tipo = scanner.nextInt();

			    	System.out.println("Digite o valor: ");
			    	double valor = scanner.nextDouble();

			    	switch(tipo) {
			    	    case 1:
                            // adicionar Real
			    	    	cofrinho.adicionar(0, valor);
			    	    	break;
			    	    case 2:
                            // adicionar Dolar
			    	    	cofrinho.adicionar(1, valor);
			    	    	break;
			    	    case 3:
                            // adicionar Euro
			    	    	cofrinho.adicionar(2, valor);
			    	    	break;
			    	    default:
			    	    	System.out.println("Tipo de moeda inválido!");
			    	}
				    break;

			    case 2: //Remover moeda
			    	System.out.println("Escolha a Moeda para remover: ");
			    	System.out.println("1- Real");
			    	System.out.println("2- Dolar");
			    	System.out.println("3- Euro");
			    	tipo = scanner.nextInt();

			    	System.out.println("Digite o valor: ");
			    	valor = scanner.nextDouble();

			    	switch(tipo) {
			    	    case 1:
                            // remover Real
			    	    	cofrinho.remover(0, valor);
			    	    	break;
			    	    case 2:
                            // remover Dolar
			    	    	cofrinho.remover(1, valor);
			    	    	break;
			    	    case 3:
                            // remover Euro
			    	    	cofrinho.remover(2, valor);
                            break;
			    	    default:
			    	    	System.out.println("Tipo de moeda inválido!");

				}
				break;


			case 3: //Listar moedas
				System.out.println("Listando moedas...");
				cofrinho.listagemMoedas();
				break;

			case 4: //Calcular total
				System.out.println("O total convertido para Real é: " + cofrinho.totalConvertido());
				break;

			case 0: //Encerrar
				System.out.println("Final do programa.");
				break;

			default:
				System.out.println("Opção Inválida!");
	   }
	}while(opcao != 0);

		scanner.close();
   }
}

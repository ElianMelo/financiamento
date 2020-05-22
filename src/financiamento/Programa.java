package financiamento;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salario, financiado, parcela, entrada, porcentagem;
		int prestacoes, menu;
		
		System.out.println("DIGITE OS DADOS DO FINANCIAMENTO");
		System.out.print("Nome do cliente: ");
		nome = sc.nextLine();
		System.out.print("Salario: ");
		salario = sc.nextDouble();
		while(salario < 0.0) {
			System.out.print("Salario: ");
			salario = sc.nextDouble();
		}
		
		System.out.print("Numero de prestacoes: ");
		prestacoes = sc.nextInt();
		System.out.print("Porcentagem de entrada: ");
		porcentagem = sc.nextDouble();
		System.out.print("Valor total financiado: ");
		financiado = sc.nextDouble();
		entrada = financiado * porcentagem / 100;
		parcela = (financiado - entrada) / prestacoes;
		
		while (parcela > salario * 0.3) {
			System.out.print("Valor total financiado: ");
			financiado = sc.nextDouble();
			entrada = financiado * porcentagem / 100;
			parcela = (financiado - entrada) / prestacoes;
		}
		
		do {
			System.out.println();
			System.out.println("MENU:");
			System.out.println("1 - Mostrar valor da entrada");
			System.out.println("2 - Mostrar o valor financiado");
			System.out.println("3 - Mostrar valor de cada prestação");
			System.out.println("4 - Sair");
			System.out.print("Digite uma opcao: ");
			menu = sc.nextInt();
			System.out.println();
			
			if (menu == 1) {
				System.out.printf("ENTRADA = R$ %.2f%n", entrada);
			} else if (menu == 2) {
				System.out.printf("VALOR FINANCIADO = R$ %.2f%n", financiado - entrada);
			} else if (menu == 3) {
				System.out.printf("VALOR DE CADA PRESTACAO = R$ %.2f%n", parcela);
			} else if (menu == 4) {
				System.out.println("FIM DO PROGRAMA!");
			} else {
				System.out.println("OPÇÃO INVÁLIDA!");
			}
		} while (menu != 4);
		
		
		sc.close();
	}

}

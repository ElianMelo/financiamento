package financiamento;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salario, financiado, parcela, entrada;
		int prestacoes, porcentagem;
		
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
		porcentagem = sc.nextInt();
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
		
		sc.close();
	}

}

package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;
import model.Exception.FullException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x = 1;

		do {

			try {

				System.out.println("Entre com os dados da conta");
				System.out.print("Numero: ");
				Integer numero = sc.nextInt();
				System.out.print("Titular: ");
				sc.nextLine();
				String titular = sc.nextLine();
				System.out.print("Saldo inicial: ");
				Double saldo = sc.nextDouble();
				System.out.print("Limite de saque: ");
				Double limite = sc.nextDouble();

				Conta conta = new Conta(numero, titular, saldo, limite);

				System.out.println();
				System.out.print("Entre com a quantidade para saque: ");
				Double quantia = sc.nextDouble();
				conta.saque(quantia);
				x = 0;
				System.out.println();
				System.out.println(conta.toString());
			} catch (FullException e) {
				System.out.println("Erro: " + e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("Valor inserido não é valido!!");
				sc.nextLine();
			}
		} while (x == 1);
		{

			sc.close();

		}
	}
}

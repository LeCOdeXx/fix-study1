package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;
import model.Exception.FullException;

public class Program {
	public static Integer numero;
	public static String titular;
	public static Double saldo;
	public static Double limite;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

				/////////1
		int x = 1;
				do {
					try {
						System.out.println("Entre com os dados da conta");
						System.out.print("Numero: ");
						numero = sc.nextInt();
						x = 0;
					} catch (InputMismatchException e) {
						sc.nextLine();
						System.out.println("Valor inserido não é valido!!");
					}
				} while (x != 0);
				//////////1
				
				
				/////////2

						System.out.print("Titular: ");
						sc.nextLine();
						titular = sc.nextLine();
				
				/////////2
				
				/////////3
			int y = 1;
				do {
					try {
						System.out.print("Saldo inicial: ");
						saldo = sc.nextDouble();
						y = 0;
					} catch (InputMismatchException e) {
						sc.nextLine();
						System.out.println("Valor inserido não é valido");
					}
				} while (y != 0);
				//////////3
				
				/////////4
			int z = 1;
					do {
						try {
							System.out.print("Limite de saque: ");
							limite = sc.nextDouble();
							z = 0;
						} catch (InputMismatchException e) {
							sc.nextLine();
							System.out.println("Valor inserido não é valido!!");
						}
					} while (z != 0);
				/////////4

				Conta conta = new Conta(numero, titular, saldo, limite);
			int a = 1;
				do {
					try {
						System.out.println();
						System.out.print("Entre com a quantidade para saque: ");
						Double quantia = sc.nextDouble();
						conta.saque(quantia);
						a = 0;
						System.out.println();
						System.out.println(conta.toString());
					} catch (InputMismatchException e) {
						sc.nextLine();
						System.out.println("Valor inserido não é valido!!");
					} catch (FullException e) {
						System.out.println("Erro: " + e.getMessage());
					}
				} while (a != 0);
			
			

		{

			sc.close();

		}
	}
}

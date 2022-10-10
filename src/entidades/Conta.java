package entidades;

import model.Exception.FullException;

public class Conta {
	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limitesaque;

	public Conta() {
	}

	public Conta(Integer numero, String titular, Double saldo, Double limite) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limitesaque = limite;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimitesaque() {
		return limitesaque;
	}

	public void saque(Double valor) throws FullException {
		if (valor < saldo && valor > limitesaque) {
			throw new FullException("Você não possui limite de saque suficiente!!");
		}
		if (valor > saldo && valor < limitesaque) {
			throw new FullException("Você não possui saldo suficiente!!");
		}
		if (valor > saldo && valor > limitesaque) {
			if (valor < saldo || valor > limitesaque) {
				throw new FullException("Você não possui limite de saque suficiente!!");
			}
			if (valor > saldo || valor < limitesaque) {
				throw new FullException("Você não possui saldo suficiente!!");
			}

		}
		saldo -= valor;
	}

	public void deposito(Double valor) {
		saldo += valor;
	}

	@Override
	public String toString() {
		return "Novo Saldo: " + "$" + saldo;
	}

}

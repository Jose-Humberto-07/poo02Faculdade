package com.flf.continuacaoterceirosemestre.aula02;

public class ContaPoupança extends Conta{


	

	public ContaPoupança(double saldo) {
		super(saldo);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("### Extrato da conta ###");
		System.out.println(this.getSaldo());
	}

}

package com.flf.continuacaoterceirosemestre.aula02;

public class ContaPoupanša extends Conta{


	

	public ContaPoupanša(double saldo) {
		super(saldo);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("### Extrato da conta ###");
		System.out.println(this.getSaldo());
	}

}

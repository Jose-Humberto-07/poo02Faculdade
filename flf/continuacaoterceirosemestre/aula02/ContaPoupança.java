package com.flf.continuacaoterceirosemestre.aula02;

public class ContaPoupan�a extends Conta{


	

	public ContaPoupan�a(double saldo) {
		super(saldo);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("### Extrato da conta ###");
		System.out.println(this.getSaldo());
	}

}

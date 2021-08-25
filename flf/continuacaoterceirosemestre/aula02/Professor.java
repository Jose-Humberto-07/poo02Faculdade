package com.flf.continuacaoterceirosemestre.aula02;

import java.util.Date;

public class Professor extends Pessoa implements MetodosPadrao{
	private double salario;
	private String disciplina;
	
	
	public Professor(String nome, String cpf, Date dataNascimento, double salario, String disciplina) {
		super(nome, cpf, dataNascimento);
		this.salario = salario;
		this.disciplina = disciplina;
	}


	@Override
	public void exibeInfoSemToString() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Data Nascimento: " + this.dataNascimento);
		System.out.println("Salario: " + this.salario);
		System.out.println("Disciplina" + this.disciplina);
	}

}

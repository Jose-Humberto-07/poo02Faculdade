package com.flf.continuacaoterceirosemestre.aula02;

import java.util.Date;

public class Aluno extends Pessoa implements MetodosPadrao{
	private String matricula;
	
	public Aluno(String nome, String cpf, Date dataNascimento, String matricula) {
		super(nome, cpf, dataNascimento);
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	


	@Override
	public void exibeInfoSemToString() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Data Nascimento: " + this.dataNascimento);
		System.out.println("Matricula" + this.matricula);
	}

}

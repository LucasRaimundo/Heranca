package br.com.turma.modelo;

public class Temporario extends Pessoa {

	public Temporario(String nome, String estado, double salario) {
		super(nome, estado, salario);
		
	}

	@Override
	public double bonus() {
		return 0;
	}

	
}

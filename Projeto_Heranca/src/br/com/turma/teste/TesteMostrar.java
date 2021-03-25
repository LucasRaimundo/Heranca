package br.com.turma.teste;

import br.com.turma.modelo.Pessoa;
import br.com.turma.modelo.PessoaFisica;
import br.com.turma.modelo.PessoaJuridica;

public class TesteMostrar {

	public static void main(String[] args) {
		
		
		PessoaJuridica pj = new PessoaJuridica("Bianca Raimundo", "SP",3500, "154879", "555555");
		System.out.println(pj);
		
		System.out.println();
		PessoaFisica pf = new PessoaFisica("Luquinha do Vrau", "SP", 50000, "499.895.558.66", "52.454.069/8");
		
		System.out.println(pf);
		
		SistemaEmpresa se = new SistemaEmpresa();
		//se.login(pj);
		
		
		

	}

}

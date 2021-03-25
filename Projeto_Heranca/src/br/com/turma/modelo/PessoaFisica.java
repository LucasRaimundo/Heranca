package br.com.turma.modelo;

public class PessoaFisica extends Pessoa implements UsuarioSistema {
	public PessoaFisica(String nome, String estado, double salario, String rg, String cpf) {
		super( nome,  estado,  salario);
		this.rg = rg;
		this.cpf = cpf;
	}
	private String rg;
	private String cpf;
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public double bonus() {
		
		return  super.reajuste() + 150;
	}
	
	
}

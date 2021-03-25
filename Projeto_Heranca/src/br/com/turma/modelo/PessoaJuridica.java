package br.com.turma.modelo;

public class PessoaJuridica extends Pessoa implements UsuarioSistema {
	public PessoaJuridica(String nome, String estado, double salario, String ie, String cnpj) {
		super(nome, estado, salario);
		this.cnpj = cnpj;
		this.ie = ie;
	}
	private String ie;
	private String cnpj;
	public String getIe() {
		return ie;
	}
	public void setIe(String ie) {
		this.ie = ie;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	@Override
	public double bonus() {
		
		return	 this.reajuste() + 200;
	}
	
	
	
	
}

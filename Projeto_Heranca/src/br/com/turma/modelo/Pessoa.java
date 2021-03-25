package br.com.turma.modelo;

public abstract class Pessoa {
	private String nome;
	private String estado;
	private double salario;
	
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public double reajuste() {
		return this.salario * 1.10;
	}
	
	public abstract double bonus();
	public Pessoa(String nome, String estado, double salario) {
		this.nome = nome;
		this.estado = estado;
		this.salario = salario;
	} 
		
	@Override
	public String toString() {
		return "Nome:"  + this.nome+"\nEstado" + this.estado +"\nSalario: "  + this.salario;
	}	
		
	
}

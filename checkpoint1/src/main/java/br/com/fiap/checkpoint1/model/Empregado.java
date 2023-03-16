package br.com.fiap.checkpoint1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empregado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigoEmpregado;
	
	private String nome;
	
	private String endereco;
	
	
	public long getCodigoEmpregado() {
		return codigoEmpregado;
	}
	public void setCodigoEmpregado(long codigoEmpregado) {
		this.codigoEmpregado = codigoEmpregado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}

package com.jpacorp.projeto.model;
import javax.persistence.*;

@Entity
@Table(name="tbconta")
public class Conta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codconta")
	private int codconta;
	
	@Column(name="agencia")
	private int agencia;
	
	@Column(name="numero")
	private int numero;
	
	@Column(name="tipo")
	private String tipo;
	
	@Column(name="saldo")
	private double saldo;
	
	@ManyToOne
	@JoinColumn(name="codigo")
	private Cliente cliente;

	public int getCodconta() {
		return codconta;
	}

	public void setCodconta(int codconta) {
		this.codconta = codconta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setC(Cliente cliente) {
		this.cliente = cliente;
	}
	
}

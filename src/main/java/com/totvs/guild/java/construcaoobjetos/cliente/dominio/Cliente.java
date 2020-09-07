package com.totvs.guild.java.construcaoobjetos.cliente.dominio;

import java.util.Objects;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {

	@Id
	private String id;
	private String nome;
	private SituacaoCliente situacao;

	Cliente() {}

	public Cliente(UUID id, String nome, SituacaoCliente situacao) {
		this.id = id.toString();
		this.nome = nome;
		this.situacao = situacao;
	}

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public boolean isAtivo() {
		return situacao.equals(SituacaoCliente.ATIVO);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(this.id);
	}

	@Override
	public boolean equals(Object obj) {
		return Objects.equals(this.id, obj);
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", situacao=" + situacao + "]";
	}
}
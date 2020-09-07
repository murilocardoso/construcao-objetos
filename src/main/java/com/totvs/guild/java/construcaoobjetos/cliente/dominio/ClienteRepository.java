package com.totvs.guild.java.construcaoobjetos.cliente.dominio;

import java.util.Optional;

public interface ClienteRepository {

	Optional<Cliente> findById(String id);

	Cliente save(Cliente cliente);
}

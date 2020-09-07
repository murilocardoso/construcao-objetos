package com.totvs.guild.java.construcaoobjetos.cliente.infra.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.totvs.guild.java.construcaoobjetos.cliente.dominio.Cliente;
import com.totvs.guild.java.construcaoobjetos.cliente.dominio.ClienteRepository;

@Repository
public interface ClienteJpaRepository extends ClienteRepository, CrudRepository<Cliente, String> {

}

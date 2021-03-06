package com.totvs.guild.java.construcaoobjetos.pedido.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.totvs.guild.java.construcaoobjetos.pedido.dominio.Pedido;
import com.totvs.guild.java.construcaoobjetos.pedido.dominio.PedidoRepository;

@Repository
public interface PedidoJpaRepository extends PedidoRepository, JpaRepository<Pedido, String> {

}

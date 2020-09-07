package com.totvs.guild.java.construcaoobjetos.pedido.dominio;

import java.util.Optional;

public interface PedidoRepository {

	Optional<Pedido> findById(String id);

	Pedido save(Pedido cliente);
}

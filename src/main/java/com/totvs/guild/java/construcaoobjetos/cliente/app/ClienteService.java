package com.totvs.guild.java.construcaoobjetos.cliente.app;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.totvs.guild.java.construcaoobjetos.cliente.dominio.ClienteRepository;
import com.totvs.guild.java.construcaoobjetos.pedido.dominio.PedidoRepository;

@Service
@Transactional
public class ClienteService {

	private final ClienteRepository clienteRepository;
	private final PedidoRepository pedidoRepository;

	public ClienteService(ClienteRepository clienteRepository, PedidoRepository pedidoRepository) {
		this.clienteRepository = clienteRepository;
		this.pedidoRepository = pedidoRepository;
	}

	public String handle(CriarPedido cmd) {

		// implementar comando

		return "";

	}
}

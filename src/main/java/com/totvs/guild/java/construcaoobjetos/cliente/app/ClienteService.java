package com.totvs.guild.java.construcaoobjetos.cliente.app;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.totvs.guild.java.construcaoobjetos.cliente.dominio.Cliente;
import com.totvs.guild.java.construcaoobjetos.cliente.dominio.ClienteRepository;
import com.totvs.guild.java.construcaoobjetos.pedido.dominio.Pedido;
import com.totvs.guild.java.construcaoobjetos.pedido.dominio.PedidoRepository;
import com.totvs.guild.java.construcaoobjetos.pedido.dominio.SituacaoPedido;

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

		Cliente cliente = clienteRepository.findById(cmd.getClienteId()).orElseThrow();

		Pedido pedido = cliente.isAtivo() 
				? new Pedido(cliente.getId(), SituacaoPedido.APROVADO)
		        : new Pedido(cliente.getId(), SituacaoPedido.AGUARDANDO_APROVACAO);

		pedidoRepository.save(pedido);

		return pedido.getId();

	}
}

package com.totvs.guild.java.construcaoobjetos.cliente.app;

import static org.assertj.core.api.Assertions.assertThat;

import javax.transaction.Transactional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.totvs.guild.java.construcaoobjetos.cliente.dominio.Cliente;
import com.totvs.guild.java.construcaoobjetos.cliente.dominio.ClienteRepository;
import com.totvs.guild.java.construcaoobjetos.cliente.dominio.SituacaoCliente;
import com.totvs.guild.java.construcaoobjetos.pedido.dominio.Pedido;
import com.totvs.guild.java.construcaoobjetos.pedido.dominio.PedidoRepository;

@Transactional
@SpringBootTest
class ClienteServiceIT {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private PedidoRepository pedidoRepository;

	@Autowired
	private ClienteService criarPedidoService;

	@Test
	@DisplayName("Deve criar pedido para o cliente")
	void deveCriarPedidoParaOCliente() {

		// given
		Cliente cliente = new Cliente("MURILO", SituacaoCliente.ATIVO);
		clienteRepository.save(cliente);

		CriarPedido criarPedido = new CriarPedido(cliente.getId());

		// when
		String pedidoId = criarPedidoService.handle(criarPedido);

		// then
		Pedido novoPedido = pedidoRepository.findById(pedidoId).orElseThrow();

		assertThat(novoPedido.getId()).isEqualTo(pedidoId);
	}
}

package br.igor.Restaurante.dto;

import br.igor.Restaurante.model.Cliente;
import br.igor.Restaurante.model.Endereco;
import br.igor.Restaurante.model.Prato;
import br.igor.Restaurante.model.Pedido;

import java.util.List;

public record ClienteResponseDTO(Long id, String nome, Endereco endereco/*, List<PedidoResponseDTO> pedidos*/) {
    public ClienteResponseDTO(Cliente cliente){
        this(cliente.getId(), cliente.getNome(), cliente.getEndereco()/*, cliente.getPedidos().stream().map(PedidoResponseDTO::new).toList()*/);
    }
}

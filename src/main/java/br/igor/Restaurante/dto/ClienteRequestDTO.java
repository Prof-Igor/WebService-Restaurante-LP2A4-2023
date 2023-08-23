package br.igor.Restaurante.dto;

import br.igor.Restaurante.model.Endereco;

public record ClienteRequestDTO(String nome, Endereco endereco) {
}

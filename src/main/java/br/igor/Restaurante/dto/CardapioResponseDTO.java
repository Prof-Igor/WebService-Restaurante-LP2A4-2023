package br.igor.Restaurante.dto;

import br.igor.Restaurante.model.Prato;

public record CardapioResponseDTO(Long id, String titulo, String descricao, Double preco) {
    public CardapioResponseDTO(Prato p){
        this(p.getId(), p.getTitulo(), p.getDescricao(), p.getPreco());
    }
}

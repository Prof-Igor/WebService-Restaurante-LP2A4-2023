package br.igor.Restaurante.repository;

import br.igor.Restaurante.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}

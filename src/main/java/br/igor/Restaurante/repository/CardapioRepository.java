package br.igor.Restaurante.repository;

import br.igor.Restaurante.model.Prato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardapioRepository extends JpaRepository<Prato, Long> {
}

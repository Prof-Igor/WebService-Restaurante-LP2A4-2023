package br.igor.Restaurante.controller;

import br.igor.Restaurante.dto.ClienteRequestDTO;
import br.igor.Restaurante.dto.ClienteResponseDTO;
import br.igor.Restaurante.dto.PedidoRequestDTO;
import br.igor.Restaurante.dto.PedidoResponseDTO;
import br.igor.Restaurante.model.Cliente;
import br.igor.Restaurante.model.Pedido;
import br.igor.Restaurante.model.Prato;
import br.igor.Restaurante.repository.CardapioRepository;
import br.igor.Restaurante.repository.ClienteRepository;
import br.igor.Restaurante.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("pedido")
public class PedidoController {
    @Autowired
    private PedidoRepository repository;

    @Autowired
    private ClienteRepository repositoryCliente;

    @Autowired
    private CardapioRepository repositoryPratos;

    @GetMapping
    public List<PedidoResponseDTO> getAll(){
        return repository.findAll().stream().map(PedidoResponseDTO::new).toList();
    }

    @PostMapping
    public void savePedido(@RequestBody PedidoRequestDTO data){
        List<Prato> p = new ArrayList<>();
        for (Long id: data.pratos()) {
            p.add(repositoryPratos.findById(id).get());
        }
        repository.save(new Pedido(data.title(), repositoryCliente.findById(data.cliente()).get(), p));
    }
}

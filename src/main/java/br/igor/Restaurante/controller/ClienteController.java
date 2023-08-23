package br.igor.Restaurante.controller;

import br.igor.Restaurante.dto.ClienteRequestDTO;
import br.igor.Restaurante.dto.ClienteResponseDTO;
import br.igor.Restaurante.model.Cliente;
import br.igor.Restaurante.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cliente")
public class ClienteController {
    @Autowired
    private ClienteRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<ClienteResponseDTO> getAll(){
        return repository.findAll().stream().map(ClienteResponseDTO::new).toList();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody ClienteRequestDTO data){
        repository.save(new Cliente(data));
    }
}

package br.com.api.service;

import br.com.api.model.Cliente;
import br.com.api.repository.ClienteRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Page<Cliente> list(Pageable pageable) {
        return clienteRepository.findAll(pageable);
    }
}

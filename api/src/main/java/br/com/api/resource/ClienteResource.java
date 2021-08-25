package br.com.api.resource;

import br.com.api.model.Cliente;
import br.com.api.service.ClienteService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("clientes")
public class ClienteResource {

    private final ClienteService clienteService;

    public ClienteResource(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    private Page<Cliente> list(Pageable pageable) {
        return  clienteService.list(pageable);
    }

    @GetMapping("{id}")
    private Cliente getById(@PathVariable Long id) {
        return  null;
    }

    @PostMapping
    private Cliente insert(@Valid @RequestBody Cliente obj) {
        return  null;
    }

    @PutMapping("{id}")
    private Cliente update(@PathVariable Long id, @Valid @RequestBody Cliente obj) {
        return  null;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {

    }
}

package org.generation.brazil.gfood.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClienteController {

    @Autowired

/*    @GetMapping("/index")
    public String index() {
        return "Uma mensagem de teste!";
    }

    @PostMapping("/post")
    public String post() {
        return "Não da pra fazer pelo browser";
    }

} */

private ClienteRepository repository;

    @GetMapping("/clientes")
    public List<Cliente> findAll() {
    // SELECT * FROM cliente
    return repository.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/clientes")
    public Cliente save(@RequestBody Cliente cliente) {
    // INSERT INTO
    return repository.save(cliente);
    }

    @PutMapping("/clientes/{id}")
    public Cliente update(@PathVariable Long id, @RequestBody Cliente cliente) {
        //Optional<Cliente> optionalCliente = repository.findById(id);
        // TODO -- Atualizar algum registro da tabela
        return null;
    }

    @DeleteMapping("/clientes/{id}")
    public void delete(@PathVariable Long id) {
    repository.deleteById(id);
    }



}

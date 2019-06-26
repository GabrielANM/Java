package org.generation.brazil.gfood.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

}

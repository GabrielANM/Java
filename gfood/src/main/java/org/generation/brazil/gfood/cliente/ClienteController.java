package org.generation.brazil.gfood.cliente;

import java.sql.Date;
import org.generation.brazil.gfood.exception.ResourceNotFoundException;
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

    @GetMapping("/clientes/{id_cliente}")
    public Optional<Cliente> finById(@PathVariable Long id_cliente) {
        return repository.findById(id_cliente);
    }

    @PostMapping("/clientes/nome")
    public List<Cliente> findByNome(@RequestParam String nome) {
        return repository.findByNome(nome);
    }

    @PostMapping("/clientes/data")
    public List<Cliente> findByDataDeNasc(@RequestParam Date data) {
        return repository.findByDataDeNasc(data);
    }

    @PostMapping("/clientes/nome_data")
    public List<Cliente> findByNomeAndDataDeNasc(@RequestParam String nome, @RequestParam Date data) {
        return repository.findByNomeAndDataDeNasc(nome, data);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/clientes")
    public Cliente save(@RequestBody Cliente cliente) {
    // INSERT INTO
    return repository.save(cliente);
    }

    @PutMapping("/clientes/{nome}")
    public Cliente findByUmNome (@PathVariable String nome, @RequestParam String novoNome) {
        return repository.save(novoNome);
    }

    @PutMapping("/clientes/{id_cliente}")
    public Cliente update(@PathVariable Long id_cliente, @RequestBody Cliente cliente) throws ResourceNotFoundException {
        return repository.findById(id_cliente).map(c -> {
            c.setNome(cliente.getNome());
            c.setEndereco(cliente.getEndereco());
            c.setDataDeNasc(cliente.getDataDeNasc());
            return repository.save(c);

        }).orElseThrow(() -> new ResourceNotFoundException("Não existe produto cadastrado com o id_cliente: " + id_cliente));
    }

    @DeleteMapping("/clientes/{id_cliente}")
    public void delete(@PathVariable Long id_cliente) {
    repository.deleteById(id_cliente);
    }



}

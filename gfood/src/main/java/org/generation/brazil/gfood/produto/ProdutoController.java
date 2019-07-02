package org.generation.brazil.gfood.produto;

import org.generation.brazil.gfood.cliente.Cliente;
import org.generation.brazil.gfood.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping("/produtos")
    public List<Produto> findAll() {
       return repository.findAll();
    }

    @GetMapping("/produtos/{id}")
    public Optional<Produto> finById(@PathVariable Long id) {
        return repository.findById(id);
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/produtos")
    public Produto save(@RequestBody Produto produto) {
        return repository.save(produto);
    }

    @PutMapping("/produtos/{id}")
    public Produto update(@PathVariable Long id, @RequestBody Produto produto) throws ResourceNotFoundException {
        return repository.findById(id).map(c -> {
            c.setNome(produto.getNome());
            c.setDescricao(produto.getDescricao());
            c.setPreco(produto.getPreco());
            return repository.save(c);

        }).orElseThrow(() -> new ResourceNotFoundException("Não existe produto cadastrado com o id: " + id));
    }

    @DeleteMapping("/produtos/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}

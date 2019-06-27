package org.generation.brazil.gfood.produto;

import org.generation.brazil.gfood.cliente.Cliente;
import org.generation.brazil.gfood.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.RejectedExecutionException;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping("/produtos")
    public List<Produto> findAll() {
       return repository.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/produtos")
    public Produto save(@RequestBody Produto produto) {
        return repository.save(produto);
    }

    @PutMapping("/produtos/{id_produto}")
    public Produto update(@PathVariable Long id_produto, @RequestBody Produto produto) throws ResourceNotFoundException {
        return repository.findById(id_produto).map(c -> {
            c.setNome(produto.getNome());
            c.setDescricao(produto.getDescricao());
            return repository.save(c);

        }).orElseThrow(() -> new ResourceNotFoundException("Não existe produto cadastrado com o id_produto: " + id_produto));
    }

    @DeleteMapping("/produtos/{id_produto}")
    public void delete(@PathVariable Long id_produto) {
        repository.deleteById(id_produto);
    }
}

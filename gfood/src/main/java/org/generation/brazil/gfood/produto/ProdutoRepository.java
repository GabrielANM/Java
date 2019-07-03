package org.generation.brazil.gfood.produto;

import org.generation.brazil.gfood.cliente.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findByPrecoBefore (BigDecimal preco);

    List<Produto> findByPrecoAfter (BigDecimal preco);

    List<Produto> findByPrecoBetween (BigDecimal min, BigDecimal max);
}

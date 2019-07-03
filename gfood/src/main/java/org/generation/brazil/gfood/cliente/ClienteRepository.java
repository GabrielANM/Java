package org.generation.brazil.gfood.cliente;

import java.sql.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {


  List<Cliente> findByNome(String cliente);
  List<Cliente> findByDataDeNasc(Date data);

  List<Cliente> findByNomeAndDataDeNasc (String nome, Date data);

  @Query (value = "SELECT nome FROM cliente ")
  List<Cliente> findByUmNome (String nome);
}

package org.generation.brazil.gfood.cliente;

import java.sql.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {


  List<Cliente> findByNome(String cliente);
  List<Cliente> findByDataDeNasc(Date data);

  List<Cliente> findByNomeAndDataDeNasc (String nome, Date data);

  @Transactional
  @Modifying
  @Query (value = "UPDATE Cliente c SET c.nome = :nome WHERE c.id_cliente = :id_cliente")
  void updateClienteByNome (@Param("nome") String nome, @Param("id_cliente") Long id_cliente);

  @Transactional
  void deleteByDataDeNascAndNome (Date dataDeNasc, String nome);

}

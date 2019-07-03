package org.generation.brazil.gfood.cliente;

import java.sql.Date;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Cliente {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cliente;

    @NotNull
    private String nome;

    private String endereco;

    @NotNull
    @Column(name = "data_de_nasc")
    private Date dataDeNasc;

}

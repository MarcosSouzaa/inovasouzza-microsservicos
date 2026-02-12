package com.inovasouzza.produtos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;

@Entity // Jpa do jakarta
@Table(name = "produtos") //nome da tabela no banco
@Data // do lombok - cria os Getters, Setters, toString, hash.
public class Produto {

    @Id // diz que essa propriedade (código) é a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para informar que ele é auto incremento
    private Long codigo;

    @Column(name = "nome", nullable = false, length = 100) //dados do schema.sql
    private String nome;
                                                        //16 caracteres no total, sendo 2 são decimais
    @Column(name = "valor_unitario", nullable = false, precision = 16, scale = 2) // nome da coluna no banco
    private BigDecimal valorUnitario; // nome da propriedade no java
}

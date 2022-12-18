package com.example.alunos.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Aluno {

    private String nome;
    private Long id_atividade;
    private String disciplina;
    private String situacao;
}

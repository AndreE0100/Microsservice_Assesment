package br.com.infnet.professor.model;

import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Aluno {
    private Long id_atividade; // id_aluno
    private String nome;    // Nome_aluno
    private String disciplina;  // disciplina
    private String situacao;    // situacao

}

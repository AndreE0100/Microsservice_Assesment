package com.example.alunos.controller;

import com.example.alunos.model.Aluno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class AlunoController {

    Map<Long, List<Aluno>> atividades = Map.of(
            1L,
            List.of(
                    Aluno.builder().nome("André").id_atividade(1L).disciplina("Matemática").situacao("concluido").build(),
                    Aluno.builder().nome("André").id_atividade(2L).disciplina("Física").situacao("concluido").build()
                    ),
                2L,
            List.of(
                    Aluno.builder().nome("Eduardo").id_atividade(1L).disciplina("Matemática").situacao("concluido").build(),
                    Aluno.builder().nome("Eduardo").id_atividade(2L).disciplina("Algebra").situacao("concluido").build(),
                    Aluno.builder().nome("Eduardo").id_atividade(3L).disciplina("Cálculo").situacao("concluido").build()

                        ));

    @GetMapping("/{id}")
    public List<Aluno> getAllByAlunoId(@PathVariable Long id){
        return atividades.get(id);
    }

}

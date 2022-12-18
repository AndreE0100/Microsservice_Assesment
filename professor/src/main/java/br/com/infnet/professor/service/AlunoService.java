package br.com.infnet.professor.service;

import br.com.infnet.professor.model.Aluno;
import br.com.infnet.professor.model.Professor;

import java.util.List;

public interface AlunoService {
    List<Aluno> findByAlunoId(Long id);

}

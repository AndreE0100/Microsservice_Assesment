package br.com.infnet.professor.service;

import br.com.infnet.professor.model.Professor;

import java.util.List;
import java.util.Optional;

public interface ProfessorService {
    List<Professor> getAll();
    Optional<Professor> getById(Long id);
    void deleteById(Long id);
    void create(Professor professor);

    void update(Professor professor);
}

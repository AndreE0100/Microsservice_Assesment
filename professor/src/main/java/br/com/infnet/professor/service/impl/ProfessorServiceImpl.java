package br.com.infnet.professor.service.impl;

import br.com.infnet.professor.model.Professor;
import br.com.infnet.professor.service.ProfessorService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProfessorServiceImpl implements ProfessorService {
    List<Professor> professors = new ArrayList<>(List.of(
            Professor.builder().id(1l).atividade("Matemática").build(),
            Professor.builder().id(2l).atividade("Física").build(),
            Professor.builder().id(3l).atividade("Programação").build(),
            Professor.builder().id(4l).atividade("Algebra").build()
    ));

    @Override
    public List<Professor> getAll() {
        return professors;
    }

    @Override
    public Optional<Professor> getById(Long id){
        return professors.stream()
                .filter(professor -> professor.getId() == id)
                .findFirst();
    }

    @Override
    public void deleteById(Long id) {
        professors.removeIf(professor -> professor.getId() == id);
    }

    @Override
    public void create(Professor professor) {
        professors.add(professor);
    }

    @Override
    public void update(Professor professor){
        deleteById(professor.getId());
        create(professor);
    }

}

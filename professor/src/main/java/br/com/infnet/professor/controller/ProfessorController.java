package br.com.infnet.professor.controller;

import br.com.infnet.professor.model.Professor;
import br.com.infnet.professor.model.Aluno;
import br.com.infnet.professor.service.ProfessorService;
import br.com.infnet.professor.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class ProfessorController {
    @Autowired
    ProfessorService professorService;
    @Autowired
    AlunoService alunoService;

    @GetMapping("/Atividades")
    public List<Professor> getAll(){
        return professorService.getAll();
    }


    @GetMapping("/Atividade/{id}")
    public ResponseEntity getById(@PathVariable Long id) {
        Optional<Professor> byId = professorService.getById(id);
        if(byId.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of("Message", "NotFound"));
        }
        return ResponseEntity.ok(byId.get());
    }
    @DeleteMapping("/DeletarAtividade/{id}")
    public void deleteById(@PathVariable Long id){
        professorService.deleteById(id);
    }

    @PostMapping("/CriarAtividade/")
    public ResponseEntity create(@RequestBody Professor professor){
        professorService.create(professor);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("Message", "Created"));
    }

    @PutMapping("/AtualizarAtividade/{id}")
    public void update(@RequestBody Professor professor){
        professorService.update(professor);
    }

    @GetMapping("/{id}")
    public ResponseEntity getAlunos(@PathVariable Long id){
        List<Aluno> alunos = alunoService.findByAlunoId(id);
        return ResponseEntity.ok(alunos);
    }

}

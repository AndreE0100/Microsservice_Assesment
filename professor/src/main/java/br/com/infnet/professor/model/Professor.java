package br.com.infnet.professor.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Professor {

    private Long id;
    private String atividade;

    public Long getId() {
        return id;
    }
}

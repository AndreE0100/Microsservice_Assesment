package br.com.infnet.professor.service.impl;

import br.com.infnet.professor.model.Aluno;
import br.com.infnet.professor.service.AlunoService;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService {


    @Override
    public List<Aluno> findByAlunoId(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.exchange("http://localhost:8081/" + id, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Aluno>>() {}
        ).getBody();


    }
}

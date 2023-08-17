package br.com.senac.apiexemple.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.apiexemple.entity.Aluno;
import br.com.senac.apiexemple.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	AlunoRepository repo;
	
	public Aluno salvar(Aluno aluno) {
		
		return repo.save(aluno);
		
	}
}

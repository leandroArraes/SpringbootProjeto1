package br.com.senac.apiexemple.inicializacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.senac.apiexemple.entity.Aluno;
import br.com.senac.apiexemple.service.AlunoService;

@Component
public class init implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private AlunoService alunoService;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("leandro");
		aluno1.setEmail("leandro@gmail.com");
		aluno1.setSobreNome("Arraes");
		alunoService.salvar(aluno1);
	}
}
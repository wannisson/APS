package br.com.test.gestaoacademica.app.repositories;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.gestaoacademica.app.aluno.AlunoEntity;
import br.com.gestaoacademica.app.aluno.AlunoRepository;
import br.com.test.gestaoacademica.app.utils.AppContextTest;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppContextTest.class)
public class AlunoRepositoryTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AlunoRepositoryTest.class);
	
	@Autowired
	private AlunoRepository    alunoRepository;
	
	
	@Test
	public void testListarUsuarios(){
		List<AlunoEntity> listaAluno = this.alunoRepository.findAll();
		
		LOGGER.info(" package " + listaAluno);
	}
	
	@Test
	public void adcionarUsuario(){
	
		AlunoEntity aluno = new AlunoEntity();
		aluno.setNome("Wannisson");
		aluno.setTelefone("991393623");
		
		alunoRepository.save(aluno);
	
	}
	
	@Test
	public void deletarUsuario(){
			
		alunoRepository.delete(1L);
	
	}
	
	
	
	

}

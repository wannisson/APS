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
import br.com.gestaoacademica.app.usuario.UsuarioEntity;
import br.com.gestaoacademica.app.usuario.UsuarioRepository;
import br.com.test.gestaoacademica.app.utils.AppContextTest;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppContextTest.class)
public class AlunoRepositoryTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AlunoRepositoryTest.class);
	
	@Autowired
	private AlunoRepository    alunoRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	@Test
	public void testListarAlunos(){
		List<AlunoEntity> listaAluno = this.alunoRepository.findAll();
		
		LOGGER.info(" aluno " + listaAluno);
	}
	
	@Test
	public void adcionarAluno(){
	
		UsuarioEntity usuario = this.usuarioRepository.findOne(1L);
		AlunoEntity aluno = new AlunoEntity();
		aluno.setNome("Wannisson");
		aluno.setTelefone("991393623");
		aluno.setUsuario(usuario);
		
		alunoRepository.save(aluno);
	
	}
	
	@Test
	public void deletarAluno(){
			
		alunoRepository.delete(1L);
	
	}
	
	
	
	

}

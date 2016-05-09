package br.com.test.gestaoacademica.app.repositories;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.gestaoacademica.app.nota.NotaEntity;
import br.com.gestaoacademica.app.nota.NotaRepository;
import br.com.test.gestaoacademica.app.utils.AppContextTest;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppContextTest.class)
public class NotaRepositoryTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(NotaRepositoryTest.class);
	
	@Autowired
	private NotaRepository		notaRepository;
	
	@Test
	public void testListarNota(){
		List<NotaEntity> listaNotas = this.notaRepository.findAll();
		
		LOGGER.info("Notas" + listaNotas);
	}
	
	@Test
	public void adicionarNota(){
		
		NotaEntity nota = new NotaEntity();
		nota.setDescricao("prova P1");
		nota.setFkDisciplina(2L);
		nota.setTitulo("P1");
		nota.setNota("10");
		
		this.notaRepository.save(nota);
		
	}
	
	@Test
	public void deletarNota(){
		this.notaRepository.delete(1L);
	}
	
	

}

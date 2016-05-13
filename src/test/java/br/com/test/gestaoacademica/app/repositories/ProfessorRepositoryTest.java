package br.com.test.gestaoacademica.app.repositories;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.gestaoacademica.app.disciplina.DisciplinaEntity;
import br.com.gestaoacademica.app.disciplina.DisciplinaRepository;
import br.com.gestaoacademica.app.professor.ProfessorEntity;
import br.com.gestaoacademica.app.professor.ProfessorRepository;
import br.com.test.gestaoacademica.app.utils.AppContextTest;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppContextTest.class)
public class ProfessorRepositoryTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProfessorRepositoryTest.class);
	
	@Autowired
	private ProfessorRepository  professorRepositoy;
	
	@Autowired
	private DisciplinaRepository disciplinaRepository;
	
	@Test
	public void testListarProfessores(){
		List<ProfessorEntity> listaProf = this.professorRepositoy.findAll();
		
		LOGGER.info("Professor" + listaProf);
	}
	
	@Test
	public void adicionarProfessor(){
	
		List<DisciplinaEntity> listaDisciplina = new ArrayList<DisciplinaEntity>();
		DisciplinaEntity disciplina = this.disciplinaRepository.findOne(1L);
		listaDisciplina.add(disciplina);
		
		
		ProfessorEntity professor = new ProfessorEntity();
		professor.setNome("jean");
		professor.setEmail("jean@fpu.com.br");
		professor.setDisciplina(listaDisciplina);
		
		this.professorRepositoy.save(professor);
	}
	
	@Test
	public void deletarProfessor(){
	
		this.professorRepositoy.delete(1L);
	}

}

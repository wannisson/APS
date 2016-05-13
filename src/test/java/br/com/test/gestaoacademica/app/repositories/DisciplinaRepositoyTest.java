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
import br.com.gestaoacademica.app.horario.HorarioEntity;
import br.com.gestaoacademica.app.horario.HorarioRepository;
import br.com.gestaoacademica.app.nota.NotaEntity;
import br.com.gestaoacademica.app.nota.NotaRepository;
import br.com.gestaoacademica.app.professor.ProfessorEntity;
import br.com.gestaoacademica.app.professor.ProfessorRepository;
import br.com.test.gestaoacademica.app.utils.AppContextTest;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppContextTest.class)
public class DisciplinaRepositoyTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DisciplinaRepositoyTest.class);

	@Autowired
	private DisciplinaRepository  disciplinaRepository;
	
	@Autowired
	private ProfessorRepository professorRepository;
	
	@Autowired
	private HorarioRepository  horarioRepository;
	
	@Autowired
	private NotaRepository notaRepository;
	
	@Test
	public void testListaDisciplina(){
		List<DisciplinaEntity> listaDisciplina = this.disciplinaRepository.findAll();
		
		LOGGER.info("Disciplina" + listaDisciplina);
	}
	
	@Test
	public void adicionarDisciplina(){
	
	List<HorarioEntity> listaHorarios = new ArrayList<HorarioEntity>();
	
	HorarioEntity horario = this.horarioRepository.findOne(1L);
	listaHorarios.add(horario);
	
	NotaEntity nota = this.notaRepository.findOne(1L);
	
	ProfessorEntity professor = this.professorRepository.findOne(2L);
	
	DisciplinaEntity disciplina = new DisciplinaEntity();
	disciplina.setId(1L);
	disciplina.setNomeDisciplina("banco de dados");
	disciplina.setAbreviacao("BD");
	disciplina.setCor("branco");
	disciplina.setHorarios(listaHorarios);
	
	
	
	
	this.disciplinaRepository.save(disciplina);
		
		
	}
	
	@Test
	public void deletarDisciplina(){
		this.disciplinaRepository.delete(1L);
	}
}



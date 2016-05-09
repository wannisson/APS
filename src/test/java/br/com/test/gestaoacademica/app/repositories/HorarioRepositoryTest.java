package br.com.test.gestaoacademica.app.repositories;

import java.util.Date;
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
import br.com.test.gestaoacademica.app.utils.AppContextTest;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppContextTest.class)
public class HorarioRepositoryTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(HorarioRepositoryTest.class);

	@Autowired
	private HorarioRepository  horarioRepository;
	
	@Autowired
	private DisciplinaRepository disciplinaRepository;

	@Test
	public void testListarHorarios() {
		List<HorarioEntity> listaHorario = this.horarioRepository.findAll();
		
		LOGGER.info("Horario" + listaHorario);

	}
	
	@Test
	public void adicionarHorario(){
		
		DisciplinaEntity disciplina = this.disciplinaRepository.findOne(2L);
		
		HorarioEntity horario = new HorarioEntity();
		horario.setData(new Date());
		horario.setHorario(new Date());
		horario.setDisciplina(disciplina);
		
		this.horarioRepository.save(horario);
	}
	
	@Test
	public void deletarHorario(){
		this.horarioRepository.delete(1L);
	}

}

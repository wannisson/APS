package br.com.test.gestaoacademica.app.repositories;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.gestaoacademica.app.disciplina.DisciplinaEntity;
import br.com.gestaoacademica.app.disciplina.DisciplinaRepository;
import br.com.gestaoacademica.app.evento.EventoEntity;
import br.com.gestaoacademica.app.evento.EventoRepository;
import br.com.gestaoacademica.app.evento.TipoEventoEnum;
import br.com.test.gestaoacademica.app.utils.AppContextTest;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppContextTest.class)
public class EventoRepositoryTest{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EventoRepositoryTest.class);

	@Autowired
	private EventoRepository eventoRepository;
	
	@Autowired 
	private DisciplinaRepository disciplinaRepository;
	
	@Test
	public void adcionarEvento(){
	
		DisciplinaEntity disciplina = this.disciplinaRepository.findOne(1L);
		
		EventoEntity evento = new EventoEntity();
		evento.setData(new Date());
		evento.setHora(new Date());
		evento.setNome("Prova P1");
		evento.setTipoEvento(TipoEventoEnum.PROVA);
		evento.setDisciplina(disciplina);
		
		this.eventoRepository.save(evento);
	}
	
	
}
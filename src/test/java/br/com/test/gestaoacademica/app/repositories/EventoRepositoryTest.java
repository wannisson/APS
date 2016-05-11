package br.com.test.gestaoacademica.app.repositories;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.gestaoacademica.app.evento.EventoRepository;
import br.com.test.gestaoacademica.app.utils.AppContextTest;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppContextTest.class)
public class EventoRepositoryTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EventoRepositoryTest.class);
	
	@Autowired
	private EventoRepository		eventoRepository;
	
	

}

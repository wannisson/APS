package br.com.test.gestaoacademica.app.repositories;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.gestaoacademica.app.usuario.UsuarioEntity;
import br.com.gestaoacademica.app.usuario.UsuarioRepository;
import br.com.test.gestaoacademica.app.utils.AppContextTest;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppContextTest.class)
public class UsuarioRepositoryTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UsuarioRepositoryTest.class);
	
	@Autowired
	private UsuarioRepository		usuarioRepository;
	
	@Test
	public void testListaUsuarios() {
		
		List<UsuarioEntity> listaUsuario = this.usuarioRepository.findAll();
		
		LOGGER.info("Usuario" + listaUsuario);
		
		
	}
	
	@Test
	public void adcionarUsuario() {
		
		UsuarioEntity usuario = new UsuarioEntity();
		usuario.setUsuario("teste");
		usuario.setEmail("teste@gmail.com");
		usuario.setSenha("123");
		
		this.usuarioRepository.save(usuario);
		
	}
	
	@Test
	public void deletarUsuario() {
		
	this.usuarioRepository.delete(2L);
		
	}

}

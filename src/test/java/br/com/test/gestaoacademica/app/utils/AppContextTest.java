package br.com.test.gestaoacademica.app.utils;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import br.com.gestaoacademica.app.utils.AppContext;

@Configuration
@Import(value = { AppContext.class })
@ComponentScan(basePackages = {"br.com.test.gestaoacademica.app"})
public class AppContextTest {
	
}

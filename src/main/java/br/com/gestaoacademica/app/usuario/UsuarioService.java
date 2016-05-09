package br.com.gestaoacademica.app.usuario;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gestaoacademica.app.utils.GenericService;
import br.com.gestaoacademica.app.utils.ServicePath;

@RestController
@RequestMapping(path = ServicePath.USUARIO_PATH)
public class UsuarioService extends GenericService<UsuarioEntity, Long>{

}

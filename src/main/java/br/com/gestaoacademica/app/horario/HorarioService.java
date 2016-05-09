package br.com.gestaoacademica.app.horario;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gestaoacademica.app.utils.GenericService;
import br.com.gestaoacademica.app.utils.ServicePath;

@RestController
@RequestMapping(path = ServicePath.HORARIO_PATH)
public class HorarioService extends GenericService<HorarioEntity, Long>{

}

package br.com.gestaoacademica.app.aluno;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gestaoacademica.app.utils.GenericService;
import br.com.gestaoacademica.app.utils.ServicePath;

@RestController
@RequestMapping(path = ServicePath.ALUNO_PATH)
public class AlunoService extends GenericService<AlunoEntity, Long>{

}

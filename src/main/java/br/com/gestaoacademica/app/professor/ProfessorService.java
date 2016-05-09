package br.com.gestaoacademica.app.professor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gestaoacademica.app.utils.GenericService;
import br.com.gestaoacademica.app.utils.ServicePath;

@RestController
@RequestMapping(path = ServicePath.PROFESSOR_PATH)
public class ProfessorService extends GenericService<ProfessorEntity, Long>{

}

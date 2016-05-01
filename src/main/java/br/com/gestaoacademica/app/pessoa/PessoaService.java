package br.com.gestaoacademica.app.pessoa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gestaoacademica.app.utils.GenericService;
import br.com.gestaoacademica.app.utils.ServicePath;

@RestController
@RequestMapping(path = ServicePath.PESSOA_PATH)
public class PessoaService extends GenericService<PessoaEntity, Long> {

}

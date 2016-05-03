package br.com.gestaoacademica.app.aluno;

import javax.persistence.Column;

import br.com.gestaoacademica.app.pessoa.PessoaEntity;

public class AlunoEntity extends PessoaEntity {
	
	@Column(name = "matricula")
	private String matricula;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
	
	
	
	

}

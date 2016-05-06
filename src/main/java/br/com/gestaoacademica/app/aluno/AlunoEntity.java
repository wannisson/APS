package br.com.gestaoacademica.app.aluno;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.gestaoacademica.app.utils.BaseEntity;



@Entity
@Table(name = "tb_aluno")
@AttributeOverride(name = "id", column = @Column(name = "id"))
public class AlunoEntity extends BaseEntity<Long>{
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "telefone")
	private String telefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	
	
	
	
	
	

}

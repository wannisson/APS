package br.com.gestaoacademica.app.professor;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.gestaoacademica.app.utils.BaseEntity;

@Entity
@Table(name = "tb_professor")
@AttributeOverride(name = "id", column = @Column(name = "id"))
public class ProfessorEntity extends BaseEntity<Long>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "nome")
	private String nome;
	
	@Column(name = "email")
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}

package br.com.gestaoacademica.app.professor;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.gestaoacademica.app.disciplina.DisciplinaEntity;
import br.com.gestaoacademica.app.utils.BaseEntity;

@Entity
@Table(name = "tb_professor")
@AttributeOverride(name = "id", column = @Column(name = "id"))
public class ProfessorEntity extends BaseEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "nome")
	private String nome;

	@Column(name = "email")
	private String email;

	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_professor")
	private List<DisciplinaEntity> disciplinas;

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

	public List<DisciplinaEntity> getDisciplina() {
		return disciplinas;
	}

	public void setDisciplina(List<DisciplinaEntity> disciplinas) {
		this.disciplinas = disciplinas;
	}

}

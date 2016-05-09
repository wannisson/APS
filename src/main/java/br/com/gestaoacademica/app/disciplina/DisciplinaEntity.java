package br.com.gestaoacademica.app.disciplina;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.gestaoacademica.app.professor.ProfessorEntity;
import br.com.gestaoacademica.app.utils.BaseEntity;

@Entity
@Table(name = "tb_disciplina")
@AttributeOverride(name = "id", column = @Column(name = "id"))
public class DisciplinaEntity extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "nome")
	private String nomeDisciplina;
	
	@Column(name = "abreviacao")
	private String abreviacao;
	
	@Column(name = "cor")
	private String cor;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_professor")
	private ProfessorEntity  professor;
	
	public DisciplinaEntity(){
		
	}
	
	public DisciplinaEntity(String nomeDisciplina, String abreviacao, 
			String cor,ProfessorEntity professor){
		super();
		this.nomeDisciplina = nomeDisciplina;
		this.abreviacao = abreviacao;
		this.cor = cor;
		this.professor = professor;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public String getAbreviacao() {
		return abreviacao;
	}

	public void setAbreviacao(String abreviacao) {
		this.abreviacao = abreviacao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public ProfessorEntity getProfessor() {
		return professor;
	}

	public void setProfessor(ProfessorEntity professor) {
		this.professor = professor;
	}
	
	
	

}

package br.com.gestaoacademica.app.nota;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.gestaoacademica.app.utils.BaseEntity;

@Entity
@Table(name = "tb_nota")
@AttributeOverride(name = "id", column = @Column(name = "id"))
public class NotaEntity extends BaseEntity<Long>{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "nota")
	private String nota;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "id_disciplina")
	private Long fkDisciplina;

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getFkDisciplina() {
		return fkDisciplina;
	}

	public void setFkDisciplina(Long fkDisciplina) {
		this.fkDisciplina = fkDisciplina;
	}
	
	

}

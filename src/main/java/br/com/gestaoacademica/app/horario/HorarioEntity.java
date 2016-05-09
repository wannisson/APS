package br.com.gestaoacademica.app.horario;



import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.gestaoacademica.app.disciplina.DisciplinaEntity;
import br.com.gestaoacademica.app.utils.BaseEntity;

@Entity
@Table(name = "tb_horario")
@AttributeOverride(name = "id", column = @Column(name = "id"))
public class HorarioEntity extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "data",unique=true)
	private Date data;
	
	@Column(name = "horario",unique=true)
	private Date horario;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_disciplina")
	private DisciplinaEntity disciplina;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public DisciplinaEntity getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(DisciplinaEntity disciplina) {
		this.disciplina = disciplina;
	}
	
	

}

package br.com.gestaoacademica.app.disciplina;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.gestaoacademica.app.horario.HorarioEntity;
import br.com.gestaoacademica.app.utils.BaseEntity;

@Entity
@Table(name = "tb_disciplina")
@AttributeOverride(name = "id", column = @Column(name = "id"))
public class DisciplinaEntity extends BaseEntity<Long> {

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

	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_disciplina")
	private List<HorarioEntity> horarios;

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

	public List<HorarioEntity> getHorarios() {
		return horarios;
	}

	public void setHorarios(List<HorarioEntity> horarios) {
		this.horarios = horarios;
	}

}

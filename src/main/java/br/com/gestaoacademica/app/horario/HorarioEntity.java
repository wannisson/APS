package br.com.gestaoacademica.app.horario;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.gestaoacademica.app.utils.BaseEntity;

@Entity
@Table(name = "tb_horario")
@AttributeOverride(name = "id", column = @Column(name = "id"))
public class HorarioEntity extends BaseEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "dia", unique = true)
	private Date dia;

	@Column(name = "h_inicio", unique = true)
	private Date inicio;

	@Column(name = "h_fim", unique = true)
	private Date fim;

	public Date getData() {
		return dia;
	}

	public void setData(Date dia) {
		this.dia = dia;
	}

	public Date getDia() {
		return dia;
	}

	public void setDia(Date dia) {
		this.dia = dia;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}

}

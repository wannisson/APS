package br.com.gestaoacademica.app.evento;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import br.com.gestaoacademica.app.utils.BaseEntity;

@Entity
@Table(name = "tb_eventos")
@AttributeOverride(name = "id", column = @Column(name = "id"))
public class EventoEntity extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "data")
	private Date data;
	
	@Column(name = "hora")
	private Date hora;
	
	@Enumerated(EnumType.STRING)
	private TipoEventoEnum tipoEvento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public TipoEventoEnum getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(TipoEventoEnum tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	

	
}

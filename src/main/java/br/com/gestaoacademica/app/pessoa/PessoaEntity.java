package br.com.gestaoacademica.app.pessoa;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.gestaoacademica.app.utils.BaseEntity;

@Entity
@Table(name = "tb_pessoa")
@AttributeOverride(name = "id", column = @Column(name = "id"))
public class PessoaEntity extends BaseEntity<Long> {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "nome", length = 60, nullable = false)
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}

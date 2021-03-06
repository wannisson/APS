package br.com.gestaoacademica.app.aluno;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.gestaoacademica.app.disciplina.DisciplinaEntity;
import br.com.gestaoacademica.app.usuario.UsuarioEntity;
import br.com.gestaoacademica.app.utils.BaseEntity;

@Entity
@Table(name = "tb_aluno")
@AttributeOverride(name = "id", column = @Column(name = "id"))
public class AlunoEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = 1L;

	@Column(name = "nome")
	private String nome;

	@Column(name = "telefone")
	private String telefone;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_usuario")
	private UsuarioEntity usuario;

	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_aluno")
	private List<DisciplinaEntity> disciplina;

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

	public UsuarioEntity getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioEntity usuario) {
		this.usuario = usuario;
	}

	public List<DisciplinaEntity> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(List<DisciplinaEntity> disciplina) {
		this.disciplina = disciplina;
	}

}

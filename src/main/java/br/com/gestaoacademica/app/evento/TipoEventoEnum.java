package br.com.gestaoacademica.app.evento;

public enum TipoEventoEnum {
	
	PROVA("Prova"),
	TRABALHO("Trabalho"),
	TAREFA("Tarefa"),
	ATIVIDADE("Atividade"),
	DEVOLUCAO("Devolucao"),
	LIVRO("Livro"),
	OUTROS("Outros");
	
	private String descricao;
	
	TipoEventoEnum(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	
	
	
	
	

}

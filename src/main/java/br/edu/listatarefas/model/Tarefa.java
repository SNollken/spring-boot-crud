package br.edu.listatarefas.model;

public class Tarefa {

	private Long id;
	private String titulo;
	private String descricao;
	private boolean concluida;

	public Tarefa() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public boolean foiConcluida() {
		return concluida;
	}

	public void marcarConclusao(boolean concluida) {
		this.concluida = concluida;
	}
}

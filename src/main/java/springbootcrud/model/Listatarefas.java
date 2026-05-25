package springbootcrud.model;

public class Listatarefas {
    private Long id;
    private String nome;
    private String descricao;
    private java.time.LocalDate dataCriacao;
    private java.time.LocalDate dataLimite;

    public Listatarefas(Long id, String nome, String descricao, java.time.LocalDate dataCriacao, java.time.LocalDate dataLimite) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.dataLimite = dataLimite;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public java.time.LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(java.time.LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public java.time.LocalDate getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(java.time.LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }
}
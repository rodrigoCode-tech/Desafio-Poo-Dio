package br.com.dio.desafio.dominio;

//Henrança, a classe conteudo é uma classe mae de mentoria e curso
public abstract class Conteudo {

    protected static final double XP_PADRAO = 10D;

    //Abstração
    private String titulo;
    private String descricao;

    public abstract double calcularXP();

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
}

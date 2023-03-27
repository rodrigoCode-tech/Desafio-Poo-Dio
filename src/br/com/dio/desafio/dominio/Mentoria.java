package br.com.dio.desafio.dominio;

import java.time.LocalDate;

//A classe mentoria extende a classe conteudo pois
public class Mentoria extends Conteudo{
    private LocalDate data;

    public Mentoria(){

    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20D;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo = '" + getTitulo() + '\'' +
                ", descrição = '" + getDescricao() + '\'' +
                ", data = " + data +
                '}';
    }
}

package com.bootcamp;

import java.time.LocalDateTime;

public class Mentoria extends Conteudo {

    private LocalDateTime data;


    public Mentoria() {

    }

    @Override
    public double calcularXP() {
        return XP_PADRAO+20;
    }


    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}

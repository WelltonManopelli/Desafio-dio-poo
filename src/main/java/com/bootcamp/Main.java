package com.bootcamp;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentaoria JAva");
        mentoria.setDescricao("descricao JAva");
        mentoria.setData(LocalDateTime.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcap java developer");
        bootcamp.setDescricao("Descrição Bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devCamila.getConteudosInscrito());
        System.out.println("--------------------------------------------------");
        devCamila.progredir();
        System.out.println("Conteudos Inscritos" + devCamila.getConteudosInscrito());
        System.out.println("Conteudos Concluidos" + devCamila.getConteudosConcluido());

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" +devJoao.getConteudosInscrito());
        devJoao.progredir();
        System.out.println("--------------------------------------------------");
        System.out.println("Conteudos Inscritos" +devJoao.getConteudosInscrito());
        System.out.println("Conteudos Concluidos" +devJoao.getConteudosConcluido());





    }

}
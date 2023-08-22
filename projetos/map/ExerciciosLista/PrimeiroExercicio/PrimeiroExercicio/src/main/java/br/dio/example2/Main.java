package br.dio.example2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<perguntas> listaPerguntas = new ArrayList<>();
        List<resposta> listaRespostas = new ArrayList<>();

        listaPerguntas.add(new perguntas("Telefonou para a vitima ? "));
        listaPerguntas.add(new perguntas("Esteve no local do crime ? "));
        listaPerguntas.add(new perguntas("Mora perto da vitima ? "));
        listaPerguntas.add(new perguntas("Devia para a vitima ? "));
        listaPerguntas.add(new perguntas("Ja trabalhou com a vitima ? "));

        System.out.println(listaPerguntas);

        System.out.println("Para responder Informe 0 para NÃO e 1 para SIM");

        listaRespostas.add(new resposta(1));
        listaRespostas.add(new resposta(1));
        listaRespostas.add(new resposta(1));
        listaRespostas.add(new resposta(1));
        listaRespostas.add(new resposta(1));

        Iterator<resposta> iterator = listaRespostas.iterator();
        int soma = 0;
        while (iterator.hasNext()){
            int next = iterator.next().getResposta();
            soma += next;
        }

        System.out.println("Sua quantidade de respostas positivas e de: " + soma);

        if(soma == 2 ){
            System.out.println("Voce e considerado um suspeito");
        }else if(soma <= 1){
            System.out.println("Voce e considerado um inocente");
        }else if(soma <= 4 ){
            System.out.println("Voce e considerado um cumplice");
        }else if(soma == 5){
            System.out.println("Voce e considerado um asssasino");
        }










    }

}


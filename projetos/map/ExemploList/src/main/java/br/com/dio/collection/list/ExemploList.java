package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<Double> notas = new ArrayList<>();

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas.toString());

        System.out.println("Exiba a posicao da nota 5.0: " + notas.indexOf(5.0));

        System.out.println("Adicione na lista a nota 8.0 na posicao 4");

        notas.add(4,8.0);

        System.out.println(notas.toString());

        System.out.println("Subistitua a nota 5.0 pela nota 6.0");

        notas.set(notas.indexOf(5.0),6.0);

        System.out.println(notas.toString());

        System.out.println("Confira se nota 5.0 esta na lista: " + notas.contains(5.0));

        System.out.println("Exiba todas as notas na orden que foram informados: ");

        //for(Double nota : notas) System.out.println(nota);









    }
}

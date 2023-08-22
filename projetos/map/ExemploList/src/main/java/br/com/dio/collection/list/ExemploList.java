package br.com.dio.collection.list;

import java.util.*;

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

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma das notas: " + soma);

        System.out.println("Exiba a media das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0 ");
        notas.remove(0.0);
        System.out.println(notas);

        System.out.println("Remova a nota da posicao 0 ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista");

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista esta vazia: " + notas.isEmpty());

        System.out.println("Crie uma lista chamada notas2");

        List<Double> notas2 = new ArrayList<>();

        notas2.add(4.0);
        notas2.add(6.4);
        notas2.add(4.5);
        notas2.add(7.9);

        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da lista sem remove-la: " + notas2.get(0));

        System.out.println("Mostre a primeira nota da lista removendo-a: " + notas2.remove(0));

        System.out.println(notas2);






    }
}

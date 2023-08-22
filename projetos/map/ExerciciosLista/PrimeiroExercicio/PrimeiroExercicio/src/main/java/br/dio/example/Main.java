package br.dio.example;

import java.nio.DoubleBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.ToDoubleFunction;

public class Main {

    public static void main(String[] args) {

        List<Temperatura> semestre = new ArrayList<>();

        semestre.add(new Temperatura("Janeiro",40.5));
        semestre.add(new Temperatura("Fevereiro",40.9));
        semestre.add(new Temperatura("Marco",39.5));
        semestre.add(new Temperatura("Abril",34.0));
        semestre.add(new Temperatura("Maio",28.0));
        semestre.add(new Temperatura("Junho",27.5));

        System.out.println(semestre);

        Iterator<Temperatura> iterator = semestre.iterator();
        Double soma = 0d;

        while (iterator.hasNext()){
            Double next = iterator.next().getTemp();
            soma += next;
        }
        Double media = soma/semestre.size();

        System.out.println("Soma das temperaturas: " + soma );
        System.out.println("Media das temperaturas: " + media);

        System.out.println("Meses que a temperatura ficou acima da media: ");

        for(int i = 0; i < semestre.size(); i++){
            if(semestre.get(i).getTemp() > media){
                System.out.print(semestre.get(i));

            }
        }

    }

    }


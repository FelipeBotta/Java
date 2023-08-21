package one.digitalinovation;


import java.util.*;


public class Main {
    public static void main(String[] args) {

        Set<Carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carro("Audi"));
        hashSetCarros.add(new Carro("Bmw"));
        hashSetCarros.add(new Carro("Porsche"));
        hashSetCarros.add(new Carro("Volkswagen"));

        System.out.println(hashSetCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Audi"));
        treeSetCarros.add(new Carro("Bmw"));
        treeSetCarros.add(new Carro("Porsche"));
        treeSetCarros.add(new Carro("Volkswagen"));

        System.out.println(treeSetCarros);














    }

}

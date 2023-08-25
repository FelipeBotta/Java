package dio.exercicio.linguagens;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        System.out.println("--\tOrdem de Inserção\t--");

        Set<Linguagens> minhasLinguagens = new LinkedHashSet<>(){{
        add(new Linguagens("Java",1995,"Eclipse"));
        add(new Linguagens("Kotlin",2011,"Intelij"));
        add(new Linguagens("Swift",2014,"Xcode"));
    }};

    for (Linguagens linguagens : minhasLinguagens){
        System.out.println(linguagens.getNome() + " - " + linguagens.getAno() + " - " + linguagens.getIde());

    }

        System.out.println("--\tOrdem Natural\t--");

        Set<Linguagens> minhasLinguagens1 = new TreeSet<>(new ComparatorNome());
        minhasLinguagens1.addAll(minhasLinguagens);
        for (Linguagens linguagens : minhasLinguagens1){
            System.out.println(linguagens.getNome() + " - " + linguagens.getAno() + " - " + linguagens.getIde());

        }

        System.out.println("--\tOrdem IDE\t--");

        Set<Linguagens> minhasLinguagens2 = new TreeSet<>(new ComparatorIde());
        minhasLinguagens2.addAll(minhasLinguagens);
        for (Linguagens linguagens : minhasLinguagens2){
            System.out.println(linguagens.getNome() + " - " + linguagens.getAno() + " - " + linguagens.getIde());

        }

        System.out.println("--\tAno de Criação e nome\t--");

        Set<Linguagens> minhasLinguagens3 = new TreeSet<>(new ComparatorAnoNome());
        minhasLinguagens3.addAll(minhasLinguagens);
        for (Linguagens linguagens : minhasLinguagens3){
            System.out.println(linguagens.getNome() + " - " + linguagens.getAno() + " - " + linguagens.getIde());

        }

        System.out.println("--\tNome Ano e Ide\t--");

        Set<Linguagens> minhasLinguagens4 = new TreeSet<>(new ComparatorNomeAnoIde());
        minhasLinguagens4.addAll(minhasLinguagens);
        for (Linguagens linguagens : minhasLinguagens4){
            System.out.println(linguagens.getNome() + " - " + linguagens.getAno() + " - " + linguagens.getIde());

        }



}
}

class ComparatorNome implements Comparator<Linguagens> {

    @Override
    public int compare(Linguagens l1, Linguagens l2) {
        int nome = l1.getNome().compareTo(l2.getNome());
        if(nome != 0) return nome;
        return l1.getIde().compareTo(l2.getIde());
    }
}

class ComparatorIde implements Comparator<Linguagens>{

    @Override
    public int compare(Linguagens l1, Linguagens l2) {
        int ide = l1.getIde().compareTo(l2.getIde());
        if (ide != 0) {
            return ide;
        }
        return l1.getNome().compareTo(l2.getNome());
    }

}

class ComparatorAnoNome implements Comparator<Linguagens>{

    @Override
    public int compare(Linguagens l1, Linguagens l2) {
        int compararAno = Integer.compare(l1.getAno(), l2.getAno());
        if(compararAno != 0) return compararAno;

        return l1.getNome().compareTo(l2.getNome());



    }}


class ComparatorNomeAnoIde implements Comparator<Linguagens>{

    @Override
    public int compare(Linguagens l1, Linguagens l2) {

        int nome = l1.getNome().compareTo(l2.getNome());
        if(nome != 0) return nome;

        int ano = Integer.compare(l1.getAno(), l2.getAno());
        if(ano != 0) return ano;

        return l1.getIde().compareTo(l2.getIde());



    }}

















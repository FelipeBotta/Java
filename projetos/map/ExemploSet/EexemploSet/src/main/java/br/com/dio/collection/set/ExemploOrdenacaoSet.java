package br.com.dio.collection.set;

import java.io.SequenceInputStream;
import java.util.*;

public class ExemploOrdenacaoSet {

    public static void main(String[] args) {


            System.out.println("--\tOrdem Aleatoria\t--");
            Set<Serie> minhasSeries = new HashSet<>(){{
                add(new Serie("Got","Fantasia",60));
                add(new Serie("Dark","Drama",60));
                add(new Serie("that 70's show","Comedia",25));
            }};

            for (Serie serie: minhasSeries){
                System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
            }


        System.out.println("--\tOrdem de Inserção\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("Got","Fantasia",60));
            add(new Serie("Dark","Drama",60));
            add(new Serie("that 70's show","Comedia",25));
        }};
        for (Serie serie: minhasSeries1){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }


        System.out.println("--\tOrdem Natural (TempoEpisodio)\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie: minhasSeries2){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem - Genero - TempoEpisodio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie: minhasSeries3){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem Genero\t--");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorGenero());
        minhasSeries4.addAll(minhasSeries);
        for (Serie serie : minhasSeries4){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem Tempo Episodio\t--");
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorTempo());
        for (Serie serie : minhasSeries5){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }











    }



}


class Serie implements Comparable<Serie> {

    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }


    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Serie serie = (Serie) object;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if(tempoEpisodio != 0) return tempoEpisodio;

       return this.getGenero().compareTo(serie.getGenero());

    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {

        int nome = s1.getNome().compareTo(s2.getNome());
        if(nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if(genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}

class ComparatorGenero implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int genero = s1.getGenero().compareTo(s2.getGenero());
        if(genero != 0) return genero;

        return s1.getNome().compareTo(s2.getNome());
    }
}

class ComparatorTempo implements  Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {

        int tempo = s1.getTempoEpisodio().compareTo(s2.getTempoEpisodio());
        if(tempo != 0) return tempo;

        return s1.getNome().compareTo(s2.getNome());

    }
}

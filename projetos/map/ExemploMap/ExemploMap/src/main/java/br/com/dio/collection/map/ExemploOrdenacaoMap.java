package br.com.dio.collection.map;

import java.util.*;

public class ExemploOrdenacaoMap {

    public static void main(String[] args) {

        System.out.println("--\t Ordem aletória\t--");
            Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo",256));
            put("Duhigg, Charles", new Livro("O poder do hábito",408));
            put("Harari, Yuval Noah", new Livro("21 lições para o Século 21",432));
        }};

            for(Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
                System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
            }

        System.out.println("--\t Ordem Inserção\t--");
            Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
                put("Hawking, Stephen", new Livro("Uma Breve História do Tempo",256));
                put("Duhigg, Charles", new Livro("O poder do hábito",408));
                put("Harari, Yuval Noah", new Livro("21 lições para o Século 21",432));
            }};

            for(Map.Entry<String, Livro> livro : meusLivros1.entrySet()){
                System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
            }

        System.out.println("--\t Ordem Alfabética dos Autores\t--");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for(Map.Entry<String, Livro> livro : meusLivros2.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\t Ordem Alfabética dos Livros\t--");

        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        System.out.println(meusLivros3);






    }
}

class Livro{
    String nome;
    Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Livro livro = (Livro) object;
        return Objects.equals(nome, livro.nome) && Objects.equals(paginas, livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}
package br.com.dio.java.io.IOObject;

import java.io.*;

public class ExempoIOObject {

    public static void serealizacao() throws IOException {

        Gato gato = new Gato("Simba",5,"Rajado");

        File f = new File("gato");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f.getName()));

        oos.writeObject(gato);

        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquivo \"%s\" criado com sucesso! Tamanho '%d' bytes. ",f.getName(),f.length());

        oos.close();
        ps.close();





    }

    public static void desserializacao(String arquivo){

    }

    public static void main(String[] args) throws IOException {
        serealizacao();
    }

}

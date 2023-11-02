package br.com.dio.java.io.IOCharacter;


import java.io.*;

public class Exercicio3IOCaracter {

    public static void copiarArquivo() throws IOException {

        File f = new File("C:\\Users\\felip\\OneDrive\\Documentos\\GitHub\\Java\\I-O\\InputOutput\\recomedacoes.txt");
        String nameArquivo= f.getName();

        /*FileReader r = new FileReader(nameArquivo);
        BufferedReader br = new BufferedReader(r);*/

        BufferedReader br = new BufferedReader(new FileReader(nameArquivo));
        String line = br.readLine();

        String nameArquivoCopy = nameArquivo.substring(0, nameArquivo.indexOf(".")).concat("copy.txt");
        File fcopy = new File(nameArquivoCopy);

        BufferedWriter bw = new BufferedWriter(new FileWriter(nameArquivoCopy));

        do{
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();
        }while(!(line == null));

        System.out.printf("Arquivo \"%s\" copiado com sucesso! com o tamanho '%d'", f.getName(), f.length());
        System.out.printf("Arquivo \"%s\" criado com sucesso! com o tamanho '%d'", fcopy.getName(), fcopy.length());






    }

    public static void adicionarInfoNoArquivo(){

    }

    public static void main(String[] args) throws IOException {

        copiarArquivo();

    }






}

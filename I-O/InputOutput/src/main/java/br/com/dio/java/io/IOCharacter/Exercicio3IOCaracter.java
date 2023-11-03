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

        System.out.printf("Arquivo \"%s\" copiado com sucesso! com o tamanho '%d' \n ", f.getName(), f.length());
        System.out.printf("Arquivo \"%s\" criado com sucesso! com o tamanho '%d' \n", fcopy.getName(), fcopy.length());

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Recomende 3 livros: ");
        pw.flush();

        adicionarInfoNoArquivo(fcopy.getName());

        pw.printf("Ok, Tudo certo ! Tamanho do arquivo '%d' bytes", fcopy.length());

        br.close();
        bw.close();
        pw.close();



    }

    public static void adicionarInfoNoArquivo(String arquivo) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo,true));

        do{
            bw.write(line);
            bw.newLine();
            line = br.readLine();

        } while(!(line.equalsIgnoreCase("fim")));

        br.close();
        bw.close();


    }

    public static void main(String[] args) throws IOException {

        copiarArquivo();

    }






}

package br.com.dio.java.io.IOCharacter;


import java.io.*;
import java.util.Scanner;

public class Exercucui2IOCaracter {

    public static void lerTecladoEscreverDocumento() throws IOException {

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Digite 3 recomendações de filmes: ");
        pw.flush();

        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        File f = new File("recomedacoes.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName()));

        


    }

    public static void main(String[] args) throws IOException {

        lerTecladoEscreverDocumento();

    }



}

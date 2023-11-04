package br.com.dio.java.io.IOData;

import java.io.*;
import java.util.Scanner;

public class ExemploIOData {

    public static void incluirProduto() throws IOException {

        File f = new File("C:\\Users\\felip\\OneDrive\\Documentos\\GitHub\\Java\\I-O\\peca-de-roupa.bin");

        PrintStream ps = new PrintStream(System.out);
        ps.flush();

      //  OutputStream os = new FileOutputStream(f.getPath());
      //  DataOutputStream dos = new DataOutputStream(os);

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(f.getPath()));

        Scanner scan = new Scanner(System.in);

        ps.print("Nome da peça: ");
        String nome = scan.nextLine();
        dos.writeUTF(nome);

        ps.print("Tamanho da Peça (P|M|G|U): ");
        char tamanho = (char) System.in.read();
        dos.writeChar(tamanho);

        ps.print("Quantidade: ");
        int quant = scan.nextInt();
        dos.writeInt(quant);

        ps.print("Preço unitário: ");
        double preco = scan.nextDouble();
        dos.writeDouble(preco);

        ps.printf("O arquivo '%s' foi criado com '%d' bytes no diretorio '%s'.\n",f.getName(), f.length(), f.getAbsolutePath());

        dos.close();
        scan.close();
        ps.close();


    }

    public static void lerProduto(String arquivo){



    }

    public static void main(String[] args) throws IOException {

        incluirProduto();

    }


}

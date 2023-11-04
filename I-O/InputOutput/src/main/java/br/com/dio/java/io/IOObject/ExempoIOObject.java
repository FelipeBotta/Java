package br.com.dio.java.io.IOObject;

import java.io.*;

public class ExempoIOObject {

    public static void serealizacao() throws IOException {

        Gato gato = new Gato("Simba",5,"Rajado",true,false);

        File f = new File("gato");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f.getName()));

        oos.writeObject(gato);

        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquivo \"%s\" criado com sucesso! Tamanho '%d' bytes. ",f.getName(),f.length());

        oos.close();
        ps.close();





    }

    public static void desserializacao(String arquivo) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo));
        Gato objetoGato = (Gato) ois.readObject();

        System.out.printf("\n Nome............: %s\n ",objetoGato.getNome());
        System.out.printf("Idade...........: %d\n ",objetoGato.getIdade());
        System.out.printf("Cor.............: %s\n ",objetoGato.getCor());
        System.out.printf("Castrado........: %s\n ",objetoGato.isCastrado());
        System.out.printf("Ronrona.........: %s\n ",objetoGato.isRonrona());
        System.out.println(objetoGato);

        ois.close();



    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
       // serealizacao();
        desserializacao("C:\\Users\\felip\\OneDrive\\Documentos\\GitHub\\Java\\I-O\\gato");

    }

}

package br.com.dio.java.io.IOByte;

import java.io.*;

public class ExemploIOBytes {

    public static void copiarArquivo() throws IOException {

        File f = new File("C:\\Users\\felip\\OneDrive\\Documentos\\GitHub\\Java\\I-O\\recomedacoescopy.txt");

        String nomeArquivo = f.getName();

//        InputStream is = new FileInputStream(nomeArquivo);
//        BufferedInputStream bis = new BufferedInputStream(is);

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(nomeArquivo));

        String nomeArquivoCopy;
        int indexOfDash = nomeArquivo.indexOf("-");
        if (indexOfDash != -1) {
            nomeArquivoCopy = nomeArquivo.substring(0, indexOfDash) + "-copy2.txt";
        } else {
            // Handle the case where "-" is not found in nomeArquivo
            nomeArquivoCopy = nomeArquivo + "-copy2.txt"; // A default behavior or alternative naming strategy
        }

        File fCopy = new File(nomeArquivoCopy);

//        OutputStream os = new FileOutputStream(nomeArquivoCopy);
//        BufferedOutputStream bos = new BufferedOutputStream(os);

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(nomeArquivoCopy));

        int line = 0;
        while ((line = bis.read()) != -1){
            bos.write((char)line);
            bos.flush();
        }

        bis.close();
        bos.close();

    }

    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }
}

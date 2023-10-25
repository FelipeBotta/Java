package br.com.dio.exceptions;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;

        do{

            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                Double resultado = dividir(Double.parseDouble(a), Double.parseDouble(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;

            } catch (NumberFormatException e) {
                //e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Entrada inválida, informe um número inteiro! " + e.getMessage());

            } catch (ArithmeticException e){
                //e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Impossível dividir um número por zero! ");

            }

            finally {
                System.out.println("Chegou no finally!");
            }

        } while(continueLooping);


        System.out.println("O codigo continua...");

    }

    public static Double dividir(Double a, Double b) {
        return a / b ;
    }

}

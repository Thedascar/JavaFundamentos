package Fundamentos.AluraJava.Livro;

import javax.swing.*;

public class SomaDoisInt{
    public static void main(String[] args) {
        int valor1 , valor2, soma;

        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro número : "));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo número : "));

         soma = valor1 + valor2;
         JOptionPane.showMessageDialog(null,"A soma de " + valor1 + " + " + valor2 + " é : " + soma);


    }
}

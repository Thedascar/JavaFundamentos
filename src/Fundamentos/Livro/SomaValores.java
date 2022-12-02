package Fundamentos.Livro;

import javax.swing.*;

public class SomaValores{
    public static void main(String[] args) {

        int valor1,valor2,valor3,valor4,soma;

        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        valor4 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));

        soma = valor1 + valor2 + valor3 + valor4;

        JOptionPane.showMessageDialog(null,soma);

    }
}

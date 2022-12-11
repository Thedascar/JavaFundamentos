package Livro;

import javax.swing.*;

public class TesteDoWhile {
    public static void main(String[] args) {

        float num,soma;
        soma = 0f;
        do{
            num = Float.parseFloat(JOptionPane.showInputDialog("Digite um número ou zero para sair."));
            soma = soma + num;
            JOptionPane.showMessageDialog(null,"A soma é: " + soma);
        }while(num != 0);
    }
}

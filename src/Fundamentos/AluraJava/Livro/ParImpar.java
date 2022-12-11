package Fundamentos.AluraJava.Livro;

import javax.swing.*;

public class ParImpar {
    public static void main(String[] args) {

        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro : "));
        if(numero % 2 == 1){
            JOptionPane.showMessageDialog(null,"O número é ímpar");
        }else{
            JOptionPane.showMessageDialog(null,"O número é Par");
        }
    }
}

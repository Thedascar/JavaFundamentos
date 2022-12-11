package Fundamentos.AluraJava.Livro;

import javax.swing.*;

public class TestaWhile {
    public static void main(String[] args) {

        float num,media,soma;
        int cont;
        cont = 0;
        soma = 0f;

        while(cont < 4){
            num = Float.parseFloat(JOptionPane.showInputDialog("Digite o número"));
             soma = soma + num;
             cont = cont + 1;
        }
        media = soma / cont;
        JOptionPane.showMessageDialog(null,"A Média é: " + media);
    }
}

package Livro;

import javax.swing.*;

public class TesteFor {
    public static void main(String[] args) {

        float numero,media,soma;
        int cont;
        cont = 0;
        soma = 0f;

        for (cont = 0; cont < 3; cont++) {
            numero = Float.parseFloat(JOptionPane.showInputDialog("Digite o número"));
            soma = soma + numero;
        }
    media = soma / cont;
        JOptionPane.showMessageDialog(null,"A média é : " + media);
    }
}

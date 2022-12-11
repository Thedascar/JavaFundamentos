package Fundamentos.AluraJava.Livro;

import javax.swing.*;

public class MediaAritmetica {
    public static void main(String[] args) {

        float numero1,numero2,numero3,media;

        numero1 = Float.parseFloat(JOptionPane.showInputDialog("Digite um número : "));
        numero2 = Float.parseFloat(JOptionPane.showInputDialog("Digite um número : "));
        numero3 = Float.parseFloat(JOptionPane.showInputDialog("Digite um número : "));

        media = (numero1 + numero2 + numero3) / 2;

        JOptionPane.showMessageDialog(null,"A média é : "  + media);
    }
}

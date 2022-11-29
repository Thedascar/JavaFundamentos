package Fundamentos.Livro;

import javax.swing.*;

public class Joption{
    public static void main(String[] args) {
        String nome;
        nome = JOptionPane.showInputDialog("Qual o seu nome");
        JOptionPane.showMessageDialog(null,"Seu nome é : " + nome);
    }
}

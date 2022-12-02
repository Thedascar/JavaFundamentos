package Fundamentos.Livro;

import javax.swing.*;

public class AumentoSalario {
    public static void main(String[] args) {
        double salario;
        double aumentoDeSalario;
        String nome;

        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu sálario: "));
        aumentoDeSalario = salario + salario * 0.0875;

        JOptionPane.showMessageDialog(null,nome +" " + "Seu novo sálario será de : " + aumentoDeSalario);


    }
}

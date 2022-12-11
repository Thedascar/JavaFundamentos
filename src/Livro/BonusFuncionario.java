package Livro;

import javax.swing.*;

public class BonusFuncionario {
    public static void main(String[] args) {
        float salario;
        float bonus;
        int tempo;

        salario = Float.parseFloat(JOptionPane.showInputDialog("Qual é o seu sálario : ")) ;
        tempo = Integer.parseInt(JOptionPane.showInputDialog("Quanto tempo de empresa você tem : "));

        if(tempo >= 5 ){
            bonus = salario + salario * 0.20F;
        } else {
            bonus = salario + salario * 0.10F;
        }
        JOptionPane.showMessageDialog(null,"Seu novo salário sera R$ " + bonus);
    }
}

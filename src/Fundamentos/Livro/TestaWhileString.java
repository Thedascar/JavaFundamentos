package Fundamentos.Livro;

import javax.swing.*;

public class TestaWhileString {
    public static void main(String[] args) {

        String resposta = "sim";

        // em java a String e um objeto e não aceita o == para igual
        // então usamos seu método equals();

        while(resposta.equals("sim")){
            resposta = JOptionPane.showInputDialog("Deseja Continuar?");
        }
    }
}

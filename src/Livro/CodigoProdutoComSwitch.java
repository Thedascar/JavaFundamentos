package Livro;

import javax.swing.*;

public class CodigoProdutoComSwitch{
    public static void main(String[] args) {

        String seletor;

        seletor = JOptionPane.showInputDialog("Digite o código");

        switch (seletor){
            case "001" :
                System.out.print("Caderno");
                break;
            case "002" :
                System.out.print("Lápis");
                break;
            case "003" :
                System.out.print("Borracha");
                break;
            default :
                System.out.print("Diversos");
                break;
        }
    }
}

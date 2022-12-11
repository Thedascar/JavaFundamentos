package Fundamentos.AluraJava.Livro;

import java.util.Scanner;

public class ParouImpar {
    public static void main(String[] args) {
        int valor;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor inteiro: ");
        valor = teclado.nextInt();

        if(valor % 2 == 0){
            if (valor > 0) {
                System.out.print("O valor " + valor + " é par.");
            } else {
                System.out.println("número ínvalido");
            }
        }else{
            System.out.print("O valor " + valor + " é ímpar.");
        }

    }
}

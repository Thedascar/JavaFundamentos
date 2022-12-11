package Livro;

import java.util.Scanner;

public class TabuadaAtomica {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        int digitador;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 10 :");
        digitador = teclado.nextInt();
        for (num1 = 0; num1 <= digitador ; num1++) {
            for (num2 = 0; num2 <= 10 ; num2++) {
                System.out.println(num1 + "X" + num2 + " = " + num1 * num2);
            }
        }
    }
}
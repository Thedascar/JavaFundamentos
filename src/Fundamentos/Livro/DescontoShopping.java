package Fundamentos.Livro;

import java.util.Scanner;

public class DescontoShopping {
    public static void main(String[] args) {
        double valor;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do seu produto: ");
        valor = teclado.nextDouble();

        valor = valor + (valor * 0.10);

        System.out.println(valor);

    }
}

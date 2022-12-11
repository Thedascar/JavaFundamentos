package Livro;

import java.util.Scanner;

public class ScannerUm {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um texto");
        String nome = teclado.nextLine();

        System.out.println(nome);
    }
}

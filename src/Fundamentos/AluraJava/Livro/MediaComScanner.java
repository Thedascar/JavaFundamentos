package Fundamentos.AluraJava.Livro;

import java.util.Scanner;

public class MediaComScanner {
    public static void main(String[] args) {

        int valor1,valor2,valor3,media;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        valor1 = sc.nextInt();

        System.out.println("Digite um número: ");
        valor2 = sc.nextInt();

        System.out.println("Digite um número: ");
        valor3 = sc.nextInt();

        media = (valor1 + valor2 + valor3) / 2;

        System.out.println("A média é : " + media);

    }
}

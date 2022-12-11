package Fundamentos.AluraJava.Livro;

import java.util.Scanner;

public class ExameAluno {
    public static void main(String[] args) {
        double nota1,nota2,nota3,exame,media;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua 1º nota: ");
        nota1 = teclado.nextDouble();
        System.out.println("Digite sua 2º nota: ");
        nota2 = teclado.nextDouble();
        System.out.println("Digite sua 3º nota: ");
        nota3 = teclado.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        if(media >= 7.0){
            System.out.println(media);
            System.out.println("passou");
        }else{
            System.out.println(media);
            System.out.println("você reprovou");
            System.out.println("Digite a nota do seu exame: ");
            exame = teclado.nextDouble();
            media = media + exame;
            if(media >= 5.0){
                System.out.println(media);
                System.out.println("passou");
            }else{
                System.out.println(media);
                System.out.println("reprovou");
            }
        }
    }
}


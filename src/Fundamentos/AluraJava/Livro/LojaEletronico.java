package Fundamentos.AluraJava.Livro;

import java.util.Scanner;

public class LojaEletronico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 4;
        int quantidadeCompra;
        double preco,resultado;

        System.out.println("1 - Tv 55");
        System.out.println("2 - Notebook");
        System.out.println("3 - Celular");
        System.out.println("4 - Cama");

        System.out.print("Selecione uma opção: ");
        opcao = teclado.nextInt();
        System.out.print("Quantas unidade vendidas: ");
        quantidadeCompra = teclado.nextInt();


        switch (opcao) {
            case 1:
                preco = 2599.00;
                resultado = quantidadeCompra * preco;
                System.out.println("A quantidade de Tv 55 vendidas foi " +
                        quantidadeCompra + " com valor de " + preco + " e o valor total foi: " + resultado);
                break;
            case 2:
                preco = 2599.00;
                resultado = quantidadeCompra * preco;
                System.out.println("A quantidade de Notebooks vendidos foi " +
                        quantidadeCompra + " com valor de " + preco + " e o valor total foi: " + resultado);
                break;
            case 3:
                preco = 3599.00;
                resultado = quantidadeCompra * preco;
                System.out.println("A quantidade de Celular vendidos foi " +
                        quantidadeCompra + " com valor de " + preco + " e o valor total foi: " + resultado);
                break;
            case 4:
                preco = 1899.00;
                resultado = quantidadeCompra * preco;
                System.out.println("A quantidade de Cama Box vendidas foi " +
                        quantidadeCompra + " com valor de " + preco + " e o valor total foi: " + resultado);
                break;
            default:
                System.out.println(" Valor Inválido");
        }
    }
}


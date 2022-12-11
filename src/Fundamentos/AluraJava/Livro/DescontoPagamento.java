package Fundamentos.AluraJava.Livro;

import java.util.Scanner;

public class DescontoPagamento {
    public static void main(String[] args) {

        int contador = 4;
        double valor;
        double resultado,resultado2;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1 - Pagameto á vista");
        System.out.println("2 - Pagameto em 3 parcelas");
        System.out.println("3 - Pagameto em 5 parcelas");
        System.out.println("4 - Pagameto em 10 parcelas");
        System.out.println("------------------------");
        System.out.print("Qual o valor da sua compra: ");
        valor = teclado.nextDouble();
        System.out.print("Selecione uma opção: ");
        contador = teclado.nextInt();

        switch(contador){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("Opcão inválida");
        }
        if(contador == 1){
            resultado = valor - (valor * 0.05);
            System.out.println("Seu valor de " + valor +
                    " com desconto de 5% ficou: " + resultado);
        } else if(contador == 2){
            resultado = valor/ 3;
            System.out.println("Sua compra de " + valor +
                    " será parcelado em 3x de : " + resultado);
        }else if(contador == 3){
            resultado = (valor + (valor * 0.02));
            resultado2 = resultado/ 5;
            System.out.println("Sua compra de " + valor + "com total de " + resultado +
                    " será parcelado em 5x de : " + resultado2);;
        }else if(contador == 4){
            resultado = (valor + (valor * 0.10));
            resultado2 = resultado/ 10;
            System.out.println("Sua compra de " + valor + "com total de " + resultado +
                    " será parcelado em 10x de : " + resultado2);
        }
    }
}

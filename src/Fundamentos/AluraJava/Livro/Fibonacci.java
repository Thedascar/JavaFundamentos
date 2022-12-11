package Fundamentos.AluraJava.Livro;

public class Fibonacci {
    public static void main(String[] args) {
        int digitado = 10;
        int contador = 0;
        int num1 = 1;
        int num2 = 0;

        while(contador <= digitado){
            contador++;
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
        }
    }
}

package Fundamentos.Livro;

public class Multiplos {
    public static void main(String[] args) {

        double valor = 2;

        if(valor % 3 == 0){
            System.out.println("É multiplo de 3");
        }else if(valor % 7 == 0){
            System.out.println("É multiplo de 7");
        }else if(valor % 3 == 0 && valor % 7 == 0){
            System.out.println("É multiplo de 3 e 7");
        }else{
            System.out.println("Não é multiplo de nenhum !!!");
        }

    }
}

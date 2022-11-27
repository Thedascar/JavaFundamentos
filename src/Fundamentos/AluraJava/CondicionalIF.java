package Fundamentos.AluraJava;

public class CondicionalIF {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");
        int idade = 17;
        int quantidadeDePessoas = 3;

        System.out.println("Sua idade é : " + idade);
        if (idade >= 18) {
            System.out.println("Lascou");
        } else {
            if(quantidadeDePessoas >= 2){
                System.out.println("você não tem 18 mas pode entrar" + " pois esta acompanhado");
            }
            System.out.println("Não pode entrar");
        }
    }
}
package Fundamentos.AluraJava;

public class EscopoVariaveis {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");
        int idade = 18;
        int quantidadePessoas = 3;
        // Usando boolean que só recebe true and false;
        // Ou pode fazer uma operação lógica
        // boolean acompanhado = quantidadePessoas >= 2;

        boolean acompanhado;


        if(quantidadePessoas >= 2 ){
            acompanhado = true;
        }else {
            acompanhado = false;
        }

        System.out.println("Sua idade é : " + idade);
        if (idade >= 18 && acompanhado) {
            System.out.println("Seja Bem Vindo");
        } else {
            System.out.println("Não pode entrar");
        }
    }
}

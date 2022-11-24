package Fundamentos;

public class CondicionalIF2 {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");
        int idade = 18;
        int quantidadePessoas = 3;
        // Usando boolean que só recebe true and false;
        // Ou pode fazer uma operação lógica
        boolean acompanhado = quantidadePessoas >= 2;

        // Usando alguns operadores de atribuição..
        // || < AND
        // && OR
        // NOT < NOT
        System.out.println("Sua idade é : " + idade);
        if (idade >= 18 && acompanhado) {
            System.out.println("Seja Bem Vindo");
        } else {
                System.out.println("Não pode entrar");
        }
    }
}

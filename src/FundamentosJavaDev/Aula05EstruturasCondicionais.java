package FundamentosJavaDev;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 16;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("pode comprar");
            return;
        }
        // ! << operador NOT de negação
        if (!isAutorizadoComprarBebida) {
            System.out.println("não pode comprar");
        }
    }
}

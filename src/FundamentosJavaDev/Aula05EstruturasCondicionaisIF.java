package FundamentosJavaDev;

public class Aula05EstruturasCondicionaisIF {
    public static void main(String[] args) {
        int idade = 16;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("pode comprar");
            return;
            // ! << operador NOT de negação
        }else{
            System.out.println("não pode comprar");
        }
    }
}

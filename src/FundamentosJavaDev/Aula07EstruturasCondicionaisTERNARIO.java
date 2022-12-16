package FundamentosJavaDev;

public class Aula07EstruturasCondicionaisTERNARIO {
    public static void main(String[] args) {

        double salario = 2000;
        String mensagemDoar = "Eu vou doar 500";
        String mensagemNaoDoar = "Não posso doar";
        // operador ternario
        System.out.println(salario > 5000 ? mensagemDoar : mensagemNaoDoar);

    }
}

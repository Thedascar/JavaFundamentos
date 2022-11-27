package Fundamentos.AluraJava;

public class Ternarios {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500";
        String mensagemNaoDoar = "Foi mal não posso";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);

    }
}

package FundamentosJavaDev;
/*
Prática
Crie variáveis para os campos descritos abaixo entre <>
e imprima a seguinte mensagem:

Eu <nome>, morando no <endereço>,
confirmo que recebi o salário de <salario>,na data <data>.
 */

import java.util.Scanner;

public class Aula03TiposPrimitiviosExercicio {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nome;
        String endereco = "Rua existente nº 695";
        String dataRecebimentoSalario;
        double salario;


        System.out.println("Qual seu nome: ");
        nome = scan.nextLine();

        System.out.println("Qual a data de hoje: ");
        dataRecebimentoSalario = scan.nextLine();

        System.out.println("Qual seu salário: ");
        salario = scan.nextDouble();


        System.out.println("Eu "+nome+ ", morando no "+endereco+ " confirmo que recebi o salário de "+salario+ ",na data "+dataRecebimentoSalario+ ".");
    }
}

package FundamentosJavaDev;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        double numero1 = 10;
        double numero2 = 20;
        double soma = numero1 + numero2;
        double subtracao = numero2 - numero1;
        double divisao = numero1 / numero2;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(divisao);

        // % operador de resto
        int resto = 20 % 8;
        System.out.println(resto);

        // operadores logicos
        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualQueDez = 10 == 10;
        boolean isDezDiferenteQueDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualQueVinte);
        System.out.println("isDezIgualQueDez "+isDezIgualQueDez);
        System.out.println("isDezDiferenteQueDez "+isDezDiferenteQueDez);

        // operadores Aritmeticos

        // AND(&&) --- Temos o Operador (!) NOT <<<<< de negação
        int idade = 35;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario > 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta"+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta"+isDentroDaLeiMenorQueTrinta);

        // OR(||)

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 4500f;

        boolean isPlayCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("isPlayCincoCompravel "+isPlayCincoCompravel);

        // Operadores de Atribuição
        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);
        bonus -= 1000;
        System.out.println(bonus);
        bonus *= 2;
        System.out.println(bonus);
        bonus /= 2;
        System.out.println(bonus);
        bonus %= 2;
        System.out.println(bonus);

        // operadores unarios
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);
        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);

        System.out.println(++contador2);



    }
}

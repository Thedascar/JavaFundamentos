package FundamentosJavaDev;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        // int,double,float,char,byte,short,long,boolean

        int idade = 27;
        // cast forçando com em um int
        int idadeLong = (int) 10000000000l;
        long numeroGrande = 100000l;
        double salarioDouble = 2700.0d;
        float salarioFloat = 2500.0f;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char catactere  = '\u0041';
        // A String não é um tipo primitivo
        //String é uma classe
        String nome = "Lucsas Ramon";

        System.out.println(nome);
        System.out.println("A idade é : " + idade);
        System.out.println(idadeLong);
        System.out.println(numeroGrande);
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        System.out.println(idadeByte);
        System.out.println(idadeShort);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(catactere);


    }
}

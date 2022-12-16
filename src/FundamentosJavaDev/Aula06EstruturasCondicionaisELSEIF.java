package FundamentosJavaDev;

public class Aula06EstruturasCondicionaisELSEIF {
    public static void main(String[] args) {
        // idade < 15 infantil
        // idade >= 15 && < 18 juvenil
        // idade > 18 adulto

        int idade = 15;
        String categoria = "";

        if(idade < 15){
            categoria = "Infantil";
        }else if(idade >= 15 && idade < 18){
            categoria = "Juvenil";
        }else{
            categoria = "Adulto";
        }
        System.out.println(categoria);
    }
}

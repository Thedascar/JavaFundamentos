package FundamentosJavaDev;

public class Aula07Arrays02 {
    public static void main(String[] args) {

        // padrão de inicialização
        // byte,short,int,long, float e double = 0
        // char '/u0000
        // boolean false
        // String null

        String []nomes = new String[4];

        nomes[0] = "Lucas";
        nomes[1] = "Aline";
        nomes[2] = "Bacon";
        nomes[3] = "Bob";


        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        


    }
}

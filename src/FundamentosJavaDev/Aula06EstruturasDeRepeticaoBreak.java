package FundamentosJavaDev;

public class Aula06EstruturasDeRepeticaoBreak {
    public static void main(String[] args) {

        // utilando break para controlar o fluxo
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if(i > 25){
               break;
            }
            System.out.println(i);
        }
    }
}

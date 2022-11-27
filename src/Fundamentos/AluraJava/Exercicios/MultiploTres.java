package Fundamentos.AluraJava.Exercicios;

public class MultiploTres {
    public static void main(String[] args) {

        for (int i = 0; i < 12; i++) {
                if(i % 3 == 0){
                    System.out.print("Com IF = " + i);
                    System.out.print(" ");
                }
        }
        System.out.println();
        for (int i = 0; i < 12; i+=3){
            System.out.print("Com for = "+ i);
            System.out.print(" ");
        }
        System.out.println();
    }
}


package Fundamentos.AluraJava.Livro;

public class AlturaLucasEPedro {
    public static void main(String[] args) {

        float alturaLucas = 1.10f;
        float alturaPedro = 1.50f;
        int contAno = 0;

        while(alturaLucas <= alturaPedro){
            alturaLucas += 0.03;
            alturaPedro += 0.02;
            contAno += 1;
        }
        System.out.println("Em " + contAno + " anos Lucas terá " + alturaLucas +
                " altura e Pedro terá " + alturaPedro);
        System.out.println("Em " + (contAno + 1) + " anos Lucas terá " + (alturaLucas += 0.03) + " altura");
    }
}

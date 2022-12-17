package FundamentosJavaDev;

public class Aula06EstruturasDeRepeticao {
    public static void main(String[] args) {

        // Estruturas de repetição
        // while, do-while,for


        // (WHILE)
        int count = 0;
        while(count <= 10){
            System.out.println(count);
            ++count;
        }

        // (DO-WHILE)
        count = 0;
        do{
            System.out.println("dentro do do-while" + count);
            count++;
        } while(count <= 10);

        // (FOR)
        for(int i=0; i <= 10 ;i++){
            System.out.println("Dentro do for "+i);
        }
    }
}

package FundamentosJavaDev;

public class Aula05EstruturasCondicionaisSwitch {
    public static void main(String[] args) {
        int dia = 10;

        switch(dia){
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sabádo");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Não existe");
        }

        char sexo = 'G';
        switch(sexo){
            case 'M':
                System.out.println("Homen");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Não Tem");
        }


    }
}

package FundamentosJavaDev;

public class Aula05EstruturasCondicionaisSwitchExercicio {
    public static void main(String[] args) {

        int dia = 10;
        switch(dia){
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Útil");
                break;
            default:
                System.out.println("ixe");
        }
    }
}

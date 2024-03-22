import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        Scanner tastieraMain = new Scanner(System.in);
        boolean stay = true;
        while (stay){
            System.out.println("*************************************************************");
            System.out.println("Digita 1 per inserire un singolo voto");
            System.out.println("Digita 2 per inserire più voti");
            System.out.println("Digita 3 per eliminare un voto");
            System.out.println("Digita 4 per visualizzare la lista di voti inseriti");
            System.out.println("Digita 5 per visualizzare i voti di una singola materia");
            System.out.println("Digita 6 per visualizzare tutti i voti insufficienti");
            System.out.println("Digita exit per uscire");
            System.out.println("*************************************************************");
            String tast = tastieraMain.nextLine();
            switch (tast) {
                case "1":

                    break;
                case "2":

                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "exit":
                    stay=false;
                    break;
                default:
                    System.out.println("Non hai inserito un comando valito");
            }
        }
        tastieraMain.close();
    }
}
import java.util.Date;
import java.util.Scanner;

public class Cinema extends Sala {
    //start progetto
    public  String[] arrayFilm;
    public  String[] arrayDurata;
    public  Date[] arrayDate;

    //static int lastIn=0;

    public Cinema () {
        arrayFilm = new String[100];
        arrayDurata = new String[100];
        arrayDate = new Date[100];
    }







    //end progetto
    /*
    public static void insertMarks(){
        System.out.println("Inserisci il voto nel formato voto materia argomento");
        Scanner tastiera1 = new Scanner(System.in);

        String voto=tastiera1.nextLine();
        arrayMarks[lastIn]=voto;

        String materia=tastiera1.nextLine();
        arraySubjects[lastIn]=materia;

        String argomento=tastiera1.nextLine();
        arrayArguments[lastIn]=argomento;

        System.out.println(arrayMarks[lastIn]+" "+arraySubjects[lastIn]+" "+arrayArguments[lastIn]);

        lastIn++;
    }

    public static void inserManyMarks(){
        System.out.println("Digita quanti voti vuoi inserire");
        Scanner tastiera2 = new Scanner(System.in);
        String numVoti=tastiera2.nextLine();
        int n=Integer.valueOf(numVoti);
        for (int i=0; i<n; i++){
            insertMarks();
        }
    }

    public static void deleteMark(){
        System.out.println("Inserisci l'argomento riferito al voto da eliminare");
        Scanner tastiera3 = new Scanner(System.in);
        String argomentoScelto = tastiera3.nextLine();
        for (int i=0; i<lastIn; i++){
            if (arrayArguments[i]==argomentoScelto){
                arrayArguments[i]=null;
                arrayMarks[i]=null;
                arraySubjects[i]=null;
            }
        }
        System.out.println("Voto rimosso con successo");
    }

    public static void printMarks() {
        System.out.println("Lista voti:");
        for (int i=0; i<lastIn; i++){
            if(arrayMarks[i]!=null) {
                System.out.println(arrayMarks[i] + " " + arraySubjects[i] + " " + arrayArguments[i]);
            }
        }
    }

    public static void printMarksBySub() {
        System.out.println("Inserisci la materia di cui vuoi visualizzare i voti:");
        Scanner tastiera4 = new Scanner(System.in);
        String materia=tastiera4.nextLine();
        for (int i=0; i<lastIn; i++){
            if(arraySubjects[i].equalsIgnoreCase(materia)) {
                System.out.println(arrayMarks[i] + " " + arraySubjects[i] + " " + arrayArguments[i]);
            }
        }
    }

    public static void printUnderageMarks() {
        System.out.println("Lista voti insufficienti:");
        for (int i=0; i<lastIn; i++){
            if(arrayMarks[i]!=null && arrayMarks[i]!="10" && arrayMarks[i].equalsIgnoreCase("1") || arrayMarks[i].equalsIgnoreCase("2") || arrayMarks[i].equalsIgnoreCase("3") || arrayMarks[i].equalsIgnoreCase("4") || arrayMarks[i].equalsIgnoreCase("5")) {
                System.out.println(arrayMarks[i] + " " + arraySubjects[i] + " " + arrayArguments[i]);
            }
        }
    }*/
}

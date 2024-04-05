package cinema;

import cinema.models.Film;
import cinema.models.Sala;
import cinema.models.Spettatore;
import cinema.services.GestoreFilm;
import cinema.services.GestoreSpettatori;

import java.util.Scanner;


public class Main {
    public static Spettatore spettatore = new Spettatore();
    public static Film film = new Film();
    public static Sala sala1 = new Sala(1,100);
    public static Sala sala2 = new Sala(2,150);

    //public static Prenotazione prenotazione = new Spettatore();
    public static void main(String[] args) {
        boolean exit = true;
        while(exit){
            String scelta = menu();
            switch(scelta) {
                case "1":
                    System.out.println("Hai selezionato 'inserire un voto'");

                    break;

                case "2":
                    System.out.println("Hai selezionato 'inserire piu voti'");
                    //CoseDaFare.massiveMarks();
                    break;

                case "3":
                    System.out.println("Hai selezionato 'eliminare un voto'");
                    //CoseDaFare.delMark();
                    break;
                case "4":
                    System.out.println("Hai selezionato 'visualizzare i voti di una materia'");
                    GestoreSpettatori g = new GestoreSpettatori();
                    g.aggiungiElemento(spettatore);;
                    break;
                case "5":
                    System.out.println("Hai selezionato 'visualizzare i voti insufficienti'");
                    GestoreFilm gf = new GestoreFilm();
                    gf.aggiungiElemento(film);
                    break;
                case "6":
                    System.out.println("Hai selezionato 'visualizzare i voti insufficienti'");
                    GestoreFilm gfd = new GestoreFilm();
                    gfd.rimuoviElemento(film);
                    break;
                case "7":
                    System.out.println("Hai selezionato 'Uscire'");
                    System.out.println("Helo");
                    exit = false;
                default:
                    System.out.println("metti un numero da 1 a 7");
            }
        }

    }
    public static String menu () {
        Scanner tastiera1 = new Scanner(System.in);
        String scelta;
        System.out.println("*");
        System.out.println("Scegli cosa fare:");
        System.out.println("inserimento di un singolo voto 1");
        System.out.println("inserimento di piu' voti 2");
        System.out.println("eliminazione voto 3");
        System.out.println("visualizza voti 4");
        System.out.println("visualizza voti materia 5");
        System.out.println("visualizza materie con voti insufficienti 6");
        System.out.println("esci 7");
        System.out.println("*");

        scelta = tastiera1.nextLine();
        //	tastiera1.close();
        return scelta;

    }
}
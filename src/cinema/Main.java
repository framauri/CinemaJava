package cinema;

import cinema.models.Film;
import cinema.models.Prenotazione;
import cinema.models.Sala;
import cinema.models.Spettatore;
import cinema.services.GestoreFilm;
import cinema.services.GestorePrenotazioni;
import cinema.services.GestoreSpettatori;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static Spettatore spettatore = new Spettatore();
    public static Film film = new Film();
    public static Prenotazione prenotazione = new Prenotazione();

    public static Sala sala1 = new Sala(1,100);
    public static Sala sala2 = new Sala(2,150);

    //public static Prenotazione prenotazione = new Spettatore();
    public static void main(String[] args) {
        GestoreSpettatori gestoreSpettatori = new GestoreSpettatori();
        GestoreFilm gestoreFilm = new GestoreFilm();
        GestorePrenotazioni gestorePrenotazioni = new GestorePrenotazioni();

        boolean exit = true;
        while(exit){
            String scelta = menu();
            switch(scelta) {
                case "1":
                    System.out.println("Hai selezionato 'creare un utente'");
                    gestoreSpettatori.aggiungiElemento();
                    break;

                case "2":
                    System.out.println("Hai selezionato 'creare un film'");
                    gestoreFilm.aggiungiElemento();
                    break;

                case "3":
                    System.out.println("Hai selezionato 'creare una prenotazione'");
                    gestorePrenotazioni.aggiungiElemento(gestoreSpettatori, gestoreFilm);
                    break;

                case "4":
                    System.out.println("Hai selezionato 'eliminare un utente'");
                    gestoreSpettatori.rimuoviElemento();
                    gestoreSpettatori.mostraLista();
                    break;

                case "5":
                    System.out.println("Hai selezionato 'eliminare un film'");
                    gestoreFilm.rimuoviElemento();
                    break;

                case "6":
                    System.out.println("Hai selezionato 'eliminare una prenotazione'");
                    gestorePrenotazioni.rimuoviElemento();
                    break;

                case "7":
                    System.out.println("Hai selezionato 'mostra lista utenti'");
                    gestoreSpettatori.mostraLista();
                    break;

                case "8":
                    System.out.println("Hai selezionato 'mostra lista film'");
                    gestoreFilm.mostraLista();
                    break;

                case "9":
                    System.out.println("Hai selezionato 'mostra lista prenotazioni'");
                    gestorePrenotazioni.mostraLista();
                    break;

                case "10":
                    System.out.println("Hai selezionato 'Uscire'");
                    System.out.println("Bye");
                    exit = false;
                default:
                    System.out.println("Inserisci un numero da 1 a 7");
            }
        }

    }
    public static String menu () {
        Scanner tastiera1 = new Scanner(System.in);
        String scelta;
        System.out.println("**********************************");
        System.out.println("Scegli cosa fare:");
        System.out.println("1 - Creare un utente");
        System.out.println("2 - Creare un film");
        System.out.println("3 - Creare una prenotazione");
        System.out.println("4 - Eliminare un utente");
        System.out.println("5 - Eliminare un film");
        System.out.println("6 - Eliminare una prenotazione");
        System.out.println("4 - Mostrare lista utenti");
        System.out.println("5 - Mostrare lista film");
        System.out.println("6 - Mostrare lista prenotazioni");
        System.out.println("10 - Uscita");
        System.out.println("**********************************");

        scelta = tastiera1.nextLine();
        //	tastiera1.close();
        return scelta;

    }
}
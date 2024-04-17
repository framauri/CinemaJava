package cinema;

import cinema.models.Sala;
import cinema.services.GestoreFilm;
import cinema.services.GestorePrenotazioni;
import cinema.services.GestoreSpettatori;
import java.util.Scanner;


public class Main {

    public static Sala sala1 = new Sala(1,100);
    public static Sala sala2 = new Sala(2,150);
    public static Sala sala3 = new Sala(3,200);
    static Sala[] arraySale = {sala1, sala2, sala3};


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
                    gestorePrenotazioni.aggiungiElemento(gestoreSpettatori, gestoreFilm, arraySale);
                    break;

                case "4":
                    System.out.println("Hai selezionato 'eliminare un utente'");
                    gestoreSpettatori.rimuoviElemento();
                    System.out.println("Lista utenti rimanenti:");
                    gestoreSpettatori.mostraLista();
                    break;

                case "5":
                    System.out.println("Hai selezionato 'eliminare un film'");
                    gestoreFilm.rimuoviElemento();
                    System.out.println("Lista film rimanenti:");
                    gestoreFilm.mostraLista();
                    break;

                case "6":
                    System.out.println("Hai selezionato 'eliminare una prenotazione'");
                    gestorePrenotazioni.rimuoviElemento();
                    System.out.println("Lista prenotazioni rimanenti:");
                    gestorePrenotazioni.mostraLista();
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
                    System.out.println("Hai selezionato 'ricerca ID utente'");
                    gestoreSpettatori.cercaIdSpettatore();
                    break;

                case "11":
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
        System.out.println("*****************************************");
        System.out.println("Scegli cosa fare:");
        System.out.println("1 - Creare un utente");
        System.out.println("2 - Creare un film");
        System.out.println("3 - Creare una prenotazione");
        System.out.println("4 - Eliminare un utente");
        System.out.println("5 - Eliminare un film");
        System.out.println("6 - Eliminare una prenotazione");
        System.out.println("7 - Mostrare lista utenti");
        System.out.println("8 - Mostrare lista film");
        System.out.println("9 - Mostrare lista prenotazioni");
        System.out.println("10 - Ricercare ID utente");
        System.out.println("11 - Uscita");
        System.out.println("*****************************************");

        scelta = tastiera1.nextLine();
        return scelta;
    }
}
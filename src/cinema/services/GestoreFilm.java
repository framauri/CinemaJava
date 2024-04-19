package cinema.services;

import cinema.models.Film;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe GestoreFilm
 * Classe che eredita i metodi da GestoreBase e li redefinisce per gestire la lista di film
 */

public class GestoreFilm extends GestoreBase<Film> {

    /**
     * Metodo aggiungiElemento di GestoreFilm
     * @throws InputMismatchException
     */

    public void aggiungiElemento() {
        Scanner tastiera4 = new Scanner(System.in);
        System.out.println("Benvenuto, inserisci i dati del film nel formato\n 'titolo'\n 'regista (cognome)'\n 'durata (minuti)':");

        //Controllo dell'input per il titolo
        String titolo1 = "";
        try {
            titolo1 = tastiera4.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Errore: il titolo deve essere una stringa.");
            return; //Esce dal metodo se si verifica un errore
        }

        //Controllo dell'input per il regista
        String regista1 = "";
        try {
            regista1 = tastiera4.nextLine();
            if (!regista1.matches("[a-zA-Z]+")) {
                throw new InputMismatchException("Errore: il cognome deve contenere solo lettere!");
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            return; //Esce dal metodo se si verifica un errore
        }

        //Controllo dell'input per la durata
        int durata1 = 0;
        try {
            durata1 = tastiera4.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Errore: la durata deve essere un numero intero.");
            return; //Esce dal metodo se si verifica un errore
        }
        tastiera4.nextLine(); //Consuma il resto della riga

        //Verifica se il film esiste già
        boolean filmEsistente = false;
        for (Film film : getListaElementi()) {
            if (film.getTitolo().equalsIgnoreCase(titolo1) && film.getRegista().equalsIgnoreCase(regista1) && film.getDurata() == durata1) {
                filmEsistente = true;
                break;
            }
        }

        //Aggiunta del film alla lista se non esiste già
        if (filmEsistente) {
            System.out.println("Questo film esiste già!");
        } else {
            Film film = new Film(titolo1, regista1, durata1);
            System.out.println("Film creato con successo!");
            getListaElementi().add(film);
        }
    }

    public void rimuoviElemento() {
        Scanner tastiera5 = new Scanner(System.in);
        System.out.println("Inserisci il nome del film da eliminare...");
        String filmDaEliminare = tastiera5.nextLine();
        //For per trovare il film e, se esistente, lo rimuove dalla lista
        for (int i = 0; i < getListaElementi().size(); i++) {
            if (getListaElementi().get(i).getTitolo().equals(filmDaEliminare)) {
                System.out.println("Film con titolo " + getListaElementi().get(i).getTitolo() + " eliminato!");
                getListaElementi().remove(getListaElementi().get(i));
            }
        }
    }

    public void mostraLista() {
        if (getListaElementi().isEmpty()) {
            System.out.println("Lista vuota!");
        }
        else {
            for (Film film : getListaElementi()) {
                System.out.println(film.formatoStampa());
            }
        }

    }
}

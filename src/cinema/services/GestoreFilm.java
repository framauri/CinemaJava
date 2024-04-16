package cinema.services;

import cinema.models.Film;
import cinema.models.Spettatore;

import java.util.ArrayList;
import java.util.Scanner;

public class GestoreFilm extends GestoreBase<Film> {

    public void aggiungiElemento() {
        Scanner tastiera4 = new Scanner(System.in);
        System.out.println("Benvenuto, inserisci i dati del film nel formato  'titolo'");
        System.out.println("'regista (cognome)'  'durata (min)':");
        String titolo1 = tastiera4.nextLine();
        String regista1 = tastiera4.next();
        int durata1 = tastiera4.nextInt();
        boolean filmEsistente = false;
        for (Film film : getListaElementi()) {
            if (film.getTitolo().equals(titolo1) && film.getRegista().equals(regista1) && film.getDurata() == durata1) {
                filmEsistente = true;
                break;
            }
        }

        if (filmEsistente) {
            System.out.println("Questo film esiste già!");
        } else {
            Film film = new Film(titolo1, regista1, durata1);
            System.out.println("Film creato con successo!");
            getListaElementi().add(film);
        }
    }


    @Override
    public void rimuoviElemento() {
        Scanner tastiera5 = new Scanner(System.in);
        tastiera5.next();
        System.out.println("Inserisci il nome del film da eliminare...");
        String filmDaEliminare = tastiera5.nextLine();
        for (int i = 0; i < getListaElementi().size(); i++) {
            if (getListaElementi().get(i).getTitolo().equals(filmDaEliminare)) {
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

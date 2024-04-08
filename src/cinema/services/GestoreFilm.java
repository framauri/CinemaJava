package cinema.services;

import cinema.models.Film;
import cinema.models.Spettatore;

import java.util.ArrayList;
import java.util.Scanner;

public class GestoreFilm extends GestoreBase<Film> {

    public void aggiungiElemento () {
        Scanner tastiera4 = new Scanner(System.in);
        System.out.println("Buongiorno, inserisci i dati del film:");
        String titolo1 = tastiera4.nextLine();
        String regista1 = tastiera4.nextLine();
        int durata1 = tastiera4.nextInt();
        Film film = new Film(titolo1, regista1, durata1);
        getListaElementi().add(film);
    }

    @Override
    public void rimuoviElemento() {
        Scanner tastiera5 = new Scanner(System.in);
        tastiera5.next();
        System.out.println("Inserisci il nome del film da eliminare");
        String filmDaEliminare = tastiera5.nextLine();
        for (int i = 0; i < getListaElementi().size(); i++) {
            if (getListaElementi().get(i).getTitolo().equals(filmDaEliminare)) {
                getListaElementi().remove(getListaElementi().get(i));
            }
        }
    }

    public void mostraLista(){
        for (Film film : getListaElementi()) {
            System.out.println(film.toString());
        }
    }

}

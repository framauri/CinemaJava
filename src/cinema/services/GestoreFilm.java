package cinema.services;

import cinema.models.Film;
import cinema.models.Spettatore;

import java.util.ArrayList;
import java.util.Scanner;

public class GestoreFilm extends GestoreBase<Film> {
    public GestoreFilm() {
        this.listaElementi = new ArrayList<>();
    }

    public void aggiungiElemento (Film film) {
        Scanner tastiera4 = new Scanner(System.in);
        System.out.println("Buongiorno, inserisci i tuoi dati:");
        String titolo1 = tastiera4.nextLine();
        String regista1 = tastiera4.nextLine();
        int durata1 = tastiera4.nextInt();
        film.setTitolo(titolo1);
        film.setRegista(regista1);
        film.setDurata(durata1);
        listaElementi.add(film);
    }

    @Override
    public void rimuoviElemento(Film film) {
        Scanner tastiera5 = new Scanner(System.in);
        tastiera5.next();
        System.out.println("Inserisci il nome del film da eliminare");
        String filmDaEliminare = tastiera5.nextLine();
        for (int i = 0; i < listaElementi.size(); i++) {
            if (listaElementi.get(i).getTitolo().equals(filmDaEliminare)) {
                listaElementi.remove(film);
            }
        }
    }

}

package cinema.services;

import cinema.models.Film;
import cinema.models.Spettatore;

import java.util.ArrayList;

public class GestoreFilm extends GestoreBase<Film> {
    public GestoreFilm() {
        this.listaElementi = new ArrayList<>();
    }

    public void aggiungiElemento ( Film film ) {
        listaElementi.add(film);
    }

    @Override
    public void rimuoviElemento(Film film) {
        listaElementi.remove(film);
    }
}

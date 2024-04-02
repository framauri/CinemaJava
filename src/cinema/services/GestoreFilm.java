package cinema.services;

import cinema.models.Film;

import java.util.ArrayList;
import java.util.List;

public class GestoreFilm {
    private List<Film> catalogoFilm;

    public GestoreFilm() {
        this.catalogoFilm = new ArrayList<>();
    }

    public void aggiungiFilm(Film film) {
        catalogoFilm.add(film);
    }

    public void rimuoviFilm(Film film) {
        catalogoFilm.remove(film);
    }

    public List<Film> getCatalogoFilm() {
        return catalogoFilm;
    }
}

package cinema.services;

import cinema.models.Spettatore;

import java.util.ArrayList;
import java.util.List;

public class GestoreSpettatori {
    private List<Spettatore> listaSpettatori;

    public GestoreSpettatori() {
        this.listaSpettatori = new ArrayList<>();
    }

    public void aggiungiSpettatore(Spettatore spettatore) {
        listaSpettatori.add(spettatore);
    }

    public void rimuoviSpettatore(Spettatore spettatore) {
        listaSpettatori.remove(spettatore);
    }

    public List<Spettatore> getListaSpettatori() {
        return listaSpettatori;
    }
}

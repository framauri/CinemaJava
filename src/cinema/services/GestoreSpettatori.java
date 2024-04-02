package cinema.services;

import cinema.models.Spettatore;

import java.util.ArrayList;

public class GestoreSpettatori extends GestoreBase<Spettatore> {
    public GestoreSpettatori() {
        this.listaElementi = new ArrayList<>();
    }

    @Override
    public void aggiungiElemento(Spettatore spettatore) {
        listaElementi.add(spettatore);
    }

    @Override
    public void rimuoviElemento(Spettatore spettatore) {
        listaElementi.remove(spettatore);
    }
}

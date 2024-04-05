package cinema.services;

import cinema.models.Prenotazione;
import cinema.models.Spettatore;

import java.util.ArrayList;

public class GestorePrenotazioni extends GestoreBase<Prenotazione> {
    public GestorePrenotazioni() {
        this.listaElementi = new ArrayList<>();
    }

    public void aggiungiElemento ( Prenotazione prenotazione ) {
        listaElementi.add(prenotazione);
    }

    @Override
    public void rimuoviElemento(Prenotazione prenotazione) {
        listaElementi.remove(prenotazione);
    }
}

package cinema.services;

import cinema.models.Prenotazione;

import java.util.ArrayList;
import java.util.List;

public class GestorePrenotazioni {
    private List<Prenotazione> prenotazioni;

    public GestorePrenotazioni() {
        this.prenotazioni = new ArrayList<>();
    }

    public void effettuaPrenotazione(Prenotazione prenotazione) {
        prenotazioni.add(prenotazione);
    }

    public void cancellaPrenotazione(Prenotazione prenotazione) {
        prenotazioni.remove(prenotazione);
    }

    public List<Prenotazione> getPrenotazioni() {
        return prenotazioni;
    }
}

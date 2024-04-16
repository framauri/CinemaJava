package cinema.models;

import java.util.Objects;

/**
 * Classe Prenotazione
 * Classe che definisce la struttura di una prenotazione
 */

public class Prenotazione {
    private static int maxId;
    private int id;
    private Spettatore spettatore;
    private Film film;
    private Sala sala;

    public Prenotazione () {
        this(null, null, null);
    }

    public Prenotazione(Spettatore spettatore, Film film, Sala sala) {
        maxId++;
        this.id = maxId;
        this.spettatore = spettatore;
        this.film = film;
        this.sala = sala;
    }

    public int getId () {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public Spettatore getSpettatore () {
        return spettatore;
    }

    public void setSpettatore ( Spettatore spettatore ) {
        this.spettatore = spettatore;
    }

    public Film getFilm () {
        return film;
    }

    public void setFilm ( Film film ) {
        this.film = film;
    }

    public Sala getSala () {
        return sala;
    }

    public void setSala ( Sala sala ) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Prenotazione{" +
                "id=" + id +
                ", spettatore=" + spettatore.toString() +
                ", film=" + film.toString() +
                ", sala=" + sala.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prenotazione that = (Prenotazione) o;
        return id == that.id &&
                Objects.equals(spettatore, that.spettatore) &&
                Objects.equals(film, that.film) &&
                Objects.equals(sala, that.sala);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, spettatore, film, sala);
    }

    /**
     * Metodo formatoStampa
     * Metodo usato da GestorePrenotazioni.mostraLista() per migliorare la stampa a terminale dei dati di una prenotazione
     * @return titolo regista durata     ////////
     */
    public String formatoStampa() {
        return  "---------------------------------" + "\n" +
                "ID Prenotazione: " + id + "\n" +
                "Spettatore: " + spettatore.formatoStampa() + "\n" +
                "Film: " + film.formatoStampa() + "\n" +
                "Sala: " + sala.formatoStampa();
    }
}

package cinema.models;

import java.util.Objects;

public class Prenotazione {
    private int id;
    private Spettatore spettatore;
    private Film film;
    private Sala sala;
    private int numeroPosti;

    public Prenotazione(int id, Spettatore spettatore, Film film, Sala sala, int numeroPosti) {
        this.id = id;
        this.spettatore = spettatore;
        this.film = film;
        this.sala = sala;
        this.numeroPosti = numeroPosti;
    }

    // Metodi getter e setter per altre variabili omessi per brevità

    @Override
    public String toString() {
        return "Prenotazione{" +
                "id=" + id +
                ", spettatore=" + spettatore +
                ", film=" + film +
                ", sala=" + sala +
                ", numeroPosti=" + numeroPosti +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prenotazione that = (Prenotazione) o;
        return id == that.id &&
                numeroPosti == that.numeroPosti &&
                Objects.equals(spettatore, that.spettatore) &&
                Objects.equals(film, that.film) &&
                Objects.equals(sala, that.sala);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, spettatore, film, sala, numeroPosti);
    }
}

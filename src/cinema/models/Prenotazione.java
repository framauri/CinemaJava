package cinema.models;

import java.util.Objects;

public class Prenotazione {
    private int id;
    private Spettatore spettatore;
    private Film film;
    private Sala sala;
    private int numeroPosti;

    public Prenotazione () {
    }

    public Prenotazione(Spettatore spettatore, Film film, Sala sala, int numeroPosti) {
        id++;
        this.spettatore = spettatore;
        this.film = film;
        this.sala = sala;
        this.numeroPosti = numeroPosti;
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

    public int getNumeroPosti () {
        return numeroPosti;
    }

    public void setNumeroPosti ( int numeroPosti ) {
        this.numeroPosti = numeroPosti;
    }

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

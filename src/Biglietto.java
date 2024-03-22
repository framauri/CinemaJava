public class Biglietto {
    private Film film;
    private Spettatore spettatore;
    private double prezzo;

    public Biglietto () {
    }

    public Biglietto ( Film film, Spettatore spettatore, double prezzo ) {
        this.film = film;
        this.spettatore = spettatore;
        this.prezzo = prezzo;
    }

    public Biglietto ( Film film, Spettatore spettatore, double prezzo, String s ) {
    }

    public Film getFilm () {
        return film;
    }

    public void setFilm ( Film film ) {
        this.film = film;
    }

    public Spettatore getSpettatore () {
        return spettatore;
    }

    public void setSpettatore ( Spettatore spettatore ) {
        this.spettatore = spettatore;
    }

    public double getPrezzo () {
        return prezzo;
    }

    public void setPrezzo ( double prezzo ) {
        this.prezzo = prezzo;
    }
}

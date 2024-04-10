package cinema.models;

import java.util.Objects;

public class Film {
    private String titolo;
    private String regista;
    private int durata; //Durata del film in minuti

    public Film () {
    }

    public Film(String titolo, String regista, int durata) {
        this.titolo = titolo;
        this.regista = regista;
        this.durata = durata;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getRegista() {
        return regista;
    }

    public void setRegista(String regista) {
        this.regista = regista;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return "Film{" +
                "titolo='" + titolo + '\'' +
                ", regista='" + regista + '\'' +
                ", durata=" + durata +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return durata == film.durata &&
                Objects.equals(titolo, film.titolo) &&
                Objects.equals(regista, film.regista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titolo, regista, durata);
    }

    public String formatoStampa() {
        return  "---------------------------------" + "\n" +
                "Titolo: " + titolo + "\n" +
                "Regista: " + regista + "\n" +
                "Durata: " + durata + " minuti";
    }
}

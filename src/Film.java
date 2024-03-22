public class Film {
    private String titolo;
    private String genere;
    private int durata;

    public Film () {
    }

    public Film ( String titolo, String genere, int durata ) {
        this.titolo = titolo;
        this.genere = genere;
        this.durata = durata;
    }

    public String getTitolo () {
        return titolo;
    }

    public void setTitolo ( String titolo ) {
        this.titolo = titolo;
    }

    public String getGenere () {
        return genere;
    }

    public void setGenere ( String genere ) {
        this.genere = genere;
    }

    public int getDurata () {
        return durata;
    }

    public void setDurata ( int durata ) {
        this.durata = durata;
    }
}

public abstract class Film {
    private String titolo;
    private String genere;
    private String durata;

    public Film () {
    }

    public Film ( String titolo, String genere, String durata ) {
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

    public String getDurata () {
        return durata;
    }

    public void setDurata ( String durata ) {
        this.durata = durata;
    }
}

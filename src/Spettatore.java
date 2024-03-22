public class Spettatore {
    private String nome;
    private String cognome;
    private int eta;
    private String sesso;

    public Spettatore () {
    }

    public Spettatore ( String nome, String cognome, int eta, String sesso ) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.sesso = sesso;
    }

    public String getNome () {
        return nome;
    }

    public void setNome ( String nome ) {
        this.nome = nome;
    }

    public String getCognome () {
        return cognome;
    }

    public void setCognome ( String cognome ) {
        this.cognome = cognome;
    }

    public int getEta () {
        return eta;
    }

    public void setEta ( int eta ) {
        this.eta = eta;
    }

    public String getSesso () {
        return sesso;
    }

    public void setSesso ( String sesso ) {
        this.sesso = sesso;
    }
}

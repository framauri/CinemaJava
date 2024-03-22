public class Sala {
    private int idSala;
    private int numeroPosti;
    private int numeroFile;  //?

    public Sala () {
    }

    public Sala ( int idSala, int numeroPosti, int numeroFile ) {
        this.idSala = idSala;
        this.numeroPosti = numeroPosti;
        this.numeroFile = numeroFile;
    }

    public int getIdSala () {
        return idSala;
    }

    public void setIdSala ( int idSala ) {
        this.idSala = idSala;
    }

    public int getNumeroPosti () {
        return numeroPosti;
    }

    public void setNumeroPosti ( int numeroPosti ) {
        this.numeroPosti = numeroPosti;
    }

    public int getNumeroFile () {
        return numeroFile;
    }

    public void setNumeroFile ( int numeroFile ) {
        this.numeroFile = numeroFile;
    }
}

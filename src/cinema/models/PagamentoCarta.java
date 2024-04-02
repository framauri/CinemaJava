package cinema.models;

public class PagamentoCarta implements Pagamento {
    private String numeroCarta;
    private String nomeIntestatario;
    private String dataScadenza;
    private String cvv;

    public PagamentoCarta(String numeroCarta, String nomeIntestatario, String dataScadenza, String cvv) {
        this.numeroCarta = numeroCarta;
        this.nomeIntestatario = nomeIntestatario;
        this.dataScadenza = dataScadenza;
        this.cvv = cvv;
    }

    @Override
    public boolean effettuaPagamento(double importo) {
        // Implementazione del pagamento con carta di credito
        System.out.println("Pagamento di " + importo + " euro effettuato con carta di credito.");
        return true;
    }
}

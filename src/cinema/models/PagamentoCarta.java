package cinema.models;

public class PagamentoCarta implements Pagamento {
    private String numeroCarta;
    private String nomeIntestatario;
    private String dataScadenza;
    private String cvv;
    double saldo;

    public PagamentoCarta(String numeroCarta, String nomeIntestatario, String dataScadenza, String cvv, double saldo) {
        this.numeroCarta = numeroCarta;
        this.nomeIntestatario = nomeIntestatario;
        this.dataScadenza = dataScadenza;
        this.cvv = cvv;
        this.saldo = saldo;
    }

    public boolean effettuaPagamento ( double importo ) {
        //Implementazione del pagamento con carta di credito
        System.out.println("Il costo è di " + importo);
        System.out.println("Inserisci la carta...");
        saldo -= importo;
        System.out.println("Pagamento di " + importo + " euro effettuato con carta di credito.");
        return true;
    }
}

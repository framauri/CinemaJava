package cinema.models;

public class PagamentoContanti implements Pagamento {
    @Override
    public boolean effettuaPagamento(double importo) {
        // Implementazione del pagamento in contanti
        System.out.println("Pagamento in contanti di " + importo + " euro effettuato.");
        return true;
    }
}

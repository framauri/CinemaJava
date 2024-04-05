package cinema.models;

import java.util.Scanner;

public class PagamentoContanti implements Pagamento {
    public boolean effettuaPagamento ( double importo ) {
        //Implementazione del pagamento in contanti
        System.out.println("Il costo è di " + importo);
        System.out.println("Inserisci i contanti...");
        Scanner tastiera3 = new Scanner(System.in);
        double contantiDati = tastiera3.nextDouble();
        double resto = importo-contantiDati;
        System.out.println("Hai dato " + contantiDati + " e il resto è di " + resto);
        return true;
    }
}

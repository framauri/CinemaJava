package cinema.services;

/**
 * Interfaccia GestioneLista
 * Interfaccia implementata da GestoreBase che fornisce metodi definiti nei gestori
 * @param <T>
 */

public interface GestioneLista<T> {

    /**
     * Metodo aggiungiElemento
     * Metodo usato da GestoreFilm, GestorePrenotazioni e GestoreSpettatori per aggiungere un elemento all'ArrayList
     */
    void aggiungiElemento();

    /**
     * Metodo rimuoviElemento
     * Metodo usato da GestoreFilm, GestorePrenotazioni e GestoreSpettatori per rimuovere un elemento all'ArrayList
     */
    void rimuoviElemento();

    /**
     * Metodo mostraLista
     * Metodo usato da GestoreFilm, GestorePrenotazioni e GestoreSpettatori per stampare lo stato della lista (vuota o elementi che la compongono)
     */
    void mostraLista();
}

package cinema.services;

public interface GestioneLista<T> {

    /**
     * Metodo aggiungiElemento
     * Metodo usato da GestoreFilm, GestorePrenotazioni e GestoreSpettatori per aggiungere un elemento alla lista
     */
    void aggiungiElemento();

    /**
     * Metodo rimuoviElemento
     * Metodo usato da GestoreFilm, GestorePrenotazioni e GestoreSpettatori per rimuovere un elemento dalla lista
     */
    void rimuoviElemento();

    /**
     * Metodo mostraLista
     * Metodo usato da GestoreFilm, GestorePrenotazioni e GestoreSpettatori per stampare lo stato della lista (vuota o elementi che la compongono)
     */
    void mostraLista();
}

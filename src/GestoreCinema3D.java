public class GestoreCinema3D extends GestoreCinema {
    // Implementazione dei metodi astratti della classe astratta GestoreCinema
    @Override
    public void vendiBiglietto(Film film, Spettatore spettatore) {
        // Implementazione della vendita del biglietto per il cinema 3D
        double prezzo = calcolaPrezzoBiglietto(film, spettatore);
        Biglietto biglietto = new Biglietto(film, spettatore, prezzo, "3D");
        // Altre operazioni di vendita del biglietto specifiche per il cinema 3D
    }

    @Override
    public void visualizzaProgrammazione() {
        // Implementazione della visualizzazione della programmazione per il cinema 3D
        System.out.println("Programmazione cinema 3D:");
        // Codice per recuperare e visualizzare la programmazione dei film in 3D
    }

    // Metodo privato per calcolare il prezzo del biglietto, specifico per il cinema 3D
    private double calcolaPrezzoBiglietto(Film film, Spettatore spettatore) {
        // Logica per calcolare il prezzo del biglietto 3D basato sul prezzo base e altri criteri (età, etc.)
        return 1; //film.getPrezzoBase() + 3.0; // Aggiunta di un costo aggiuntivo per il 3D
    }

    // Altri metodi specifici per il cinema 3D
    public void attivaOcchialini3D() {
        // Codice per attivare il sistema di visualizzazione 3D
    }

    public void disattivaOcchialini3D() {
        // Codice per disattivare il sistema di visualizzazione 3D
    }
}

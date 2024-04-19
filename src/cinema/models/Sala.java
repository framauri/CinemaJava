package cinema.models;

import java.util.Objects;

/**
 * Classe Sala
 * Classe che definisce la struttura di una sala
 */

public class Sala {
    private int numero;
    private int capacita;

    public Sala () {
    }

    public Sala(int numero, int capacita) {
        this.numero = numero;
        this.capacita = capacita;
    }

    public int getNumero () {
        return numero;
    }

    public int getCapacita () {
        return capacita;
    }

    public void setNumero ( int numero ) {
        this.numero = numero;
    }

    public void setCapacita ( int capacita ) {
        this.capacita = capacita;
    }


    @Override
    public String toString() {
        return "Sala{" +
                "numero=" + numero +
                ", capacita=" + capacita +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sala sala = (Sala) o;
        return numero == sala.numero &&
                capacita == sala.capacita;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, capacita);
    }


    /**
     * Metodo formatoStampa
     * Metodo usato in GestorePrenotazioni.mostraLista() per migliorare la stampa a terminale dei dati di una sala
     * @return numero
     */
    public String formatoStampa() {
        return  "---------------------------------" + "\n" +
                "Numero Sala: " + numero;
    }
}
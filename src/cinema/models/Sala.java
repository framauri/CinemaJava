package cinema.models;

import java.util.Objects;

public class Sala {
    private int numero;
    private int capacita;
    private static int numeroSaleTotali = 0;

    public Sala () {
    }

    public Sala(int numero, int capacita) {
        this.numero = numero;
        this.capacita = capacita;
        numeroSaleTotali++; //Incremento del numero totale di sale al momento della creazione di una nuova sala
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

    public static int getNumeroSaleTotali() {
        return numeroSaleTotali;
    }

    public static void setNumeroSaleTotali ( int numeroSaleTotali ) {
        Sala.numeroSaleTotali = numeroSaleTotali;
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
}
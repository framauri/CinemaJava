package cinema.models;

public class Sala {
    private int numero;
    private int capacita;

    public Sala(int numero, int capacita) {
        this.numero = numero;
        this.capacita = capacita;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacita() {
        return capacita;
    }

    public void setCapacita(int capacita) {
        this.capacita = capacita;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "numero=" + numero +
                ", capacita=" + capacita +
                '}';
    }
}

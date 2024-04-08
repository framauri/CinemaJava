package cinema.models;

import java.util.Objects;

public class Spettatore {
    private static int maxId;
    private int id;
    private String nome;
    private String cognome;
    private int eta;

    public Spettatore () {
    }

    public Spettatore(String nome, String cognome, int eta) {
        maxId++;
        this.id=maxId;
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public int getId () {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "Spettatore{" +
                "id=" + id +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                '}';
    }

    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spettatore that = (Spettatore) o;
        return id == that.id && eta == that.eta && Objects.equals(nome, that.nome) && Objects.equals(cognome, that.cognome);
    }

    @Override
    public int hashCode () {
        return Objects.hash(id, nome, cognome, eta);
    }
}

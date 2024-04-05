package cinema.services;

public interface Interfaccia<T> {
    public abstract void aggiungiElemento(T elemento);

    public abstract void rimuoviElemento(T elemento);

    public void mostraLista();
}

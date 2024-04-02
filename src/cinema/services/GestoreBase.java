package cinema.services;

import java.util.List;

public abstract class GestoreBase<T> {
    protected List<T> listaElementi;

    public abstract void aggiungiElemento(T elemento);

    public abstract void rimuoviElemento(T elemento);

    public List<T> getListaElementi() {
        return listaElementi;
    }
}

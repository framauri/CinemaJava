package cinema.services;

import java.util.ArrayList;

public abstract class GestoreBase<T> implements Interfaccia<T> {
    private ArrayList<T> listaElementi = new ArrayList<T>();

    public ArrayList<T> getListaElementi () {
        return listaElementi;
    }

    public void aggiungiElemento (){
    }

    public void rimuoviElemento (){
    }

    public void mostraLista (){
    }
}

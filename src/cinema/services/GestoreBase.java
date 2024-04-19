package cinema.services;

import java.util.ArrayList;

/**
 * Classe astratta GestoreBase
 * Classe astratta che si occupa della creazione di un ArrayList di oggetti generici e definisce il metodo getLista elementi.
 * Questa classe è la classe padre dei gestori che la estendono.
 * Implementa l'interfaccia GestioneLista.
 * @param <T>
 */

public abstract class GestoreBase<T> implements GestioneLista<T> {
    private ArrayList<T> listaElementi = new ArrayList<T>();

    /**
     * Metodo che ritorna l'ArrayList degli elementi e viene chiamato dai gestori figli di GestoreBase
     * @return listaElementi
     */
    public ArrayList<T> getListaElementi () {
        return listaElementi;
    }
}

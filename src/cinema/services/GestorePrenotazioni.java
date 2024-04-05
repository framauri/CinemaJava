package cinema.services;

import cinema.models.Prenotazione;
import cinema.models.Spettatore;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorePrenotazioni extends GestoreBase<Prenotazione> {
//    public GestorePrenotazioni() {
//        this.listaElementi = new ArrayList<>();
//    }

    public void aggiungiElemento ( Prenotazione prenotazione ) {
        Scanner tastiera7 = new Scanner(System.in);
        System.out.println("Buongiorno, creiamo una prenotazione:");
        //prenotazione.setSpettatore();
        //prenotazione.setFilm();
        //prenotazione.setSala(); //creare sala nel main
        getListaElementi().add(prenotazione);
    }

    @Override
    public void rimuoviElemento(Prenotazione prenotazione) {
        getListaElementi().remove(prenotazione);
    }

    public void mostraLista(){

    }
}

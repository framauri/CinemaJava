package cinema.services;

import cinema.models.Film;
import cinema.models.Prenotazione;
import cinema.models.Spettatore;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorePrenotazioni {

    private ArrayList<Prenotazione> listaElementi = new ArrayList<Prenotazione>();

    public void aggiungiElemento (GestoreSpettatori g, GestoreFilm f) {
        Scanner tastiera7 = new Scanner(System.in);
        System.out.println("Buongiorno, creiamo una prenotazione:");
        System.out.println("Inserisci il tuo ID utente: ");
        int idUtente = tastiera7.nextInt();
        Prenotazione p = new Prenotazione();
        //ricerca utente per id
        for (Spettatore ut : g.getListaElementi()) {
            if (ut.getId() == idUtente) {
                p.setSpettatore(ut);
                break;
            }
        }

        Scanner tastiera8 = new Scanner(System.in);
        System.out.println("Inserisci il film che desideri vedere: ");
        String nomeF = tastiera8.nextLine();
        for (Film film : f.getListaElementi()) {
            if (film.getTitolo() == nomeF) {
                p.setFilm(film);
                break;
            }
        }

        System.out.println("Inserisci la sala: ");
        int numSala = tastiera7.nextInt();
        //p.setSala(numSala);

        System.out.println("Prenotazione creata con successo!");
    }

    public void rimuoviElemento() {
        Scanner tastiera9 = new Scanner(System.in);
        tastiera9.next();
        System.out.println("Inserisci l'id della prenotazione da eliminare");
        int idDaEliminare = tastiera9.nextInt();
        for (int i = 0; i < getListaElementi().size(); i++) {
            if (getListaElementi().get(i).getId() == idDaEliminare) {
                getListaElementi().remove(getListaElementi().get(i));
            }
        }
    }

    public ArrayList<Prenotazione> getListaElementi () {
        return listaElementi;
    }

    public void mostraLista(){
        for (Prenotazione prenotazione : getListaElementi()) {
            System.out.println(prenotazione);
        }
    }
}

package cinema.services;

import cinema.models.Film;
import cinema.models.Prenotazione;
import cinema.models.Sala;
import cinema.models.Spettatore;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorePrenotazioni {

    private ArrayList<Prenotazione> listaElementi = new ArrayList<Prenotazione>();

    public void aggiungiElemento (GestoreSpettatori g, GestoreFilm f, Sala[] arraySale) {
        Scanner tastiera7 = new Scanner(System.in);
        System.out.println("Benvenuto, creiamo una prenotazione:");
        System.out.println("Inserisci l'ID utente: ");
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
        System.out.println("Inserisci il titolo del film scelto: ");
        f.mostraLista();
        String nomeF = tastiera8.nextLine();
        for (Film film : f.getListaElementi()) {
            if (film.getTitolo().equals(nomeF)) {
                p.setFilm(film);
                break;
            }
        }

        Scanner tastiera9 = new Scanner(System.in);
        System.out.println("Sale disponibili:");
        for (Sala s : arraySale) {
            System.out.println(s.getNumero());
        }

        boolean salaTrovata = false;
        System.out.println("Inserisci il numero della sala:");
        int numSala = tastiera9.nextInt();
        for (Sala sa : arraySale) {
            if (sa.getNumero() == numSala && sa.getCapacita() > 0) {
                p.setSala(sa);
                sa.setCapacita(sa.getCapacita() - 1);
                salaTrovata = true;
                break; //Esci dal ciclo una volta trovata una sala valida
            }
        }

        if (!salaTrovata) {
            System.out.println("Sala non esistente o posti esauriti!");
        }


        if(p.getSpettatore().getId() != 0 && p.getFilm().getTitolo() != null && p.getSala().getNumero() != 0){
            //getnum di sala genera excp se non esiste sala
            System.out.println("Prenotazione creata con successo!");
        }
    }

    public void rimuoviElemento() {
        Scanner tastiera9 = new Scanner(System.in);
        tastiera9.next();
        System.out.println("Inserisci l'id della prenotazione da eliminare:");
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

    public void mostraLista() {
        for (Prenotazione prenotazione : getListaElementi()) {
            System.out.println(prenotazione.formatoStampa() + prenotazione.getSpettatore().formatoStampa() + prenotazione.getFilm().formatoStampa() + prenotazione.getSala().formatoStampa());
        }
    }
}

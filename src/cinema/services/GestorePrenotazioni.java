package cinema.services;

import cinema.models.Film;
import cinema.models.Prenotazione;
import cinema.models.Sala;
import cinema.models.Spettatore;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class GestorePrenotazioni extends GestoreBase<Prenotazione> {

    Prenotazione p = new Prenotazione();


    public void aggiungiElemento (GestoreSpettatori g, GestoreFilm f, Sala[] arraySale) {
        Scanner tastiera7 = new Scanner(System.in);
        System.out.println("Benvenuto, creiamo una prenotazione:");

        int idUtente = 0;
        boolean inputCorretto = false;

        if (!g.getListaElementi().isEmpty()) {
            while (!inputCorretto) {
                System.out.println("Inserisci l'ID utente: ");
                try {
                    idUtente = tastiera7.nextInt();
                    for (Spettatore ut : g.getListaElementi()) {
                        if (ut.getId() == idUtente) {
                            System.out.println("ID valido");
                            inputCorretto = true;
                            break;
                        }
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Errore: devi inserire un numero intero.");
                    tastiera7.next();
                }
            }
        }
        else{
            System.out.println("Lista vuota! Devi prima creare un utenza!");
            g.aggiungiElemento();

            p.setSpettatore(g.getListaElementi().getFirst());
        }

        //ricerca utente per id
//        for (Spettatore ut : g.getListaElementi()) {
//            if (ut.getId() == idUtente) {
//                p.setSpettatore(ut);
//                break;
//            }
//        }

        String nomeF = " ";
        boolean inputCorrettoFilm = false;

        if (!f.getListaElementi().isEmpty()) {
            while (!inputCorrettoFilm) {
                Scanner tastiera8 = new Scanner(System.in);
                System.out.println("Inserisci il titolo del film scelto: ");
                f.mostraLista();
                try {
                    nomeF = tastiera8.nextLine();
                    for (Film film : f.getListaElementi()) {
                        if (Objects.equals(film.getTitolo(), nomeF)) {
                            System.out.println("Film esistente");
                            inputCorrettoFilm = true;
                            break;
                        }
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Errore: devi inserire un film esistente.");
                }
            }
        }
        else{
            System.out.println("Lista vuota! Devi prima creare un film!");
            f.aggiungiElemento();

            p.setFilm(f.getListaElementi().getFirst());
        }

        //ricerca film per titolo
//        for (Film film : f.getListaElementi()) {
//            if (film.getTitolo().equals(nomeF)) {
//                p.setFilm(film);
//                break;
//            }
//        }
        Scanner tastiera9 = new Scanner(System.in);
        System.out.println("Sale disponibili:");
        for (Sala s : arraySale) {
            System.out.println(s.getNumero());
        }

        boolean salaTrovata = false;
        while (!salaTrovata){
            try{
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
            }
            catch (Exception e){
                System.out.println("Errore: devi inserire una sala esistente.");
            }
        }

            getListaElementi().add(p);
            System.out.println("Prenotazione creata con successo!");

    }

    @Override
    public void aggiungiElemento () {

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

    public void mostraLista() {
        if (getListaElementi().isEmpty()) {
            System.out.println("Lista vuota!");
        }
        else{
            for (Prenotazione prenotazione : getListaElementi()) {
                System.out.println(prenotazione.formatoStampa());
            }
        }

    }
}
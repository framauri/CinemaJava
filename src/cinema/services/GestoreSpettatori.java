package cinema.services;

import cinema.models.Film;
import cinema.models.Spettatore;

import java.util.ArrayList;
import java.util.Scanner;

import static cinema.models.Spettatore.availableIds;

public class GestoreSpettatori extends GestoreBase<Spettatore> {


    public void aggiungiElemento () {
        Scanner tastiera2 = new Scanner(System.in);
        System.out.println("Benvenuto, inserisci i tuoi dati nel formato  'nome'  'cognome'  'età':");
        String nome1 = tastiera2.next();
        String cognome1 = tastiera2.next();
        int eta1 = tastiera2.nextInt();
        boolean utenzaEsistente = false;
        for (Spettatore spettatore : getListaElementi()) {
            if (spettatore.getNome().equals(nome1) && spettatore.getCognome().equals(cognome1) && spettatore.getEta() == eta1) {
                utenzaEsistente = true;
                break;
            }
        }

        if (utenzaEsistente) {
            System.out.println("Questa utenza esiste già!");
        } else {
            Spettatore spettatore = new Spettatore(nome1, cognome1, eta1);
            System.out.println("Utente creato con successo!");
            System.out.println("Il tuo ID utente è " + spettatore.getId());
            getListaElementi().add(spettatore);
        }
    }

    public void rimuoviElemento () {
        Scanner tastiera6 = new Scanner(System.in);
        System.out.println("Inserisci l'ID dell'utente da eliminare...");
        int idDaEliminare = tastiera6.nextInt();

        for (int i = 0; i < getListaElementi().size(); i++) {
            if (getListaElementi().get(i).getId() == (idDaEliminare)) {
                getListaElementi().remove(getListaElementi().get(i));
                availableIds.offer(idDaEliminare); // Aggiungi l'ID eliminato alla coda degli ID disponibili
            }
        }
    }

    public void mostraLista() {
        if (getListaElementi().isEmpty()) {
            System.out.println("Lista vuota!");
        }
        else{
            for (Spettatore spettatore : getListaElementi()) {
                System.out.println(spettatore.formatoStampa());
            }
        }
    }

    public int trovaIdSpettatore(String nome, String cognome, int eta) {
        for (Spettatore spettatore : getListaElementi()) {
            if (spettatore.getNome().equals(nome) && spettatore.getCognome().equals(cognome) && spettatore.getEta() == eta) {
                return spettatore.getId();
            }
        }
        return -1; //Ritorna -1 se lo spettatore non è stato trovato
    }


    public void cercaIdSpettatore() {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci il nome dello spettatore:");
        String nome = tastiera.next();
        System.out.println("Inserisci il cognome dello spettatore:");
        String cognome = tastiera.next();
        System.out.println("Inserisci l'età dello spettatore:");
        int eta = tastiera.nextInt();

        int idSpettatore = trovaIdSpettatore(nome, cognome, eta);
        if (idSpettatore != -1) {
            System.out.println("Lo spettatore con nome " + nome + ", cognome " + cognome + " e età " + eta + " ha ID: " + idSpettatore);
        } else {
            System.out.println("Lo spettatore non è stato trovato.");
        }
    }
}

package cinema.services;

import cinema.models.Spettatore;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
import static cinema.models.Spettatore.availableIds;

public class GestoreSpettatori extends GestoreBase<Spettatore> {

    public void aggiungiElemento() {
        Scanner tastiera2 = new Scanner(System.in);
        boolean utenzaEsistente = false;
        String nome1 = "";
        String cognome1 = "";
        System.out.println("Benvenuto, inserisci i tuoi dati nel formato\n 'nome'\n 'cognome'\n 'età':");
        try {
            nome1 = tastiera2.nextLine();
            if (!nome1.matches("[a-zA-Z]+")) {
                throw new InputMismatchException("Errore: il nome deve contenere solo lettere!");
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            return; //Esce dal metodo se si verifica un errore
        }

        //Controllo dell'input per il cognome
        try {
            cognome1 = tastiera2.nextLine();
            if (!cognome1.matches("[a-zA-Z]+")) {
                throw new InputMismatchException("Errore: il cognome deve contenere solo lettere!");
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            return; //Esce dal metodo se si verifica un errore
        }

        //Controllo dell'input per l'età
        int eta1 = 0;
        try {
            eta1 = tastiera2.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Errore: l'età deve essere un numero intero.");
            return; //Esce dal metodo se si verifica un errore
        }
        tastiera2.nextLine(); //Consuma il resto della riga

        //Verifica se lo spettatore esiste già
        for (Spettatore spettatore : getListaElementi()) {
            if (spettatore.getNome().equals(nome1) && spettatore.getCognome().equals(cognome1) && spettatore.getEta() == eta1) {
                utenzaEsistente = true;
                break;
            }
        }

        //Aggiunta dello spettatore alla lista se non esiste già
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
                availableIds.offer(idDaEliminare); //Aggiunge l'ID eliminato alla coda degli ID disponibili
            }
        }
        //Ordina la lista per ID dopo la rimozione
        Collections.sort(getListaElementi());
    }

    public void mostraLista() {
        if (getListaElementi().isEmpty()) {
            System.out.println("Lista vuota!");
        }
        else{
            Collections.sort(getListaElementi());
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
        String nome = "";
        try {
        nome = tastiera.nextLine();
            if (!nome.matches("[a-zA-Z]+")) {
                throw new InputMismatchException();
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Errore: il nome deve contenere solo lettere!");
            return; //Esce dal metodo se si verifica un errore
        }

        System.out.println("Inserisci il cognome dello spettatore:");
        String cognome = "";
        try {
            cognome = tastiera.nextLine();
            if (!cognome.matches("[a-zA-Z]+")) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Errore: il nome deve contenere solo lettere!");
            return; //Esce dal metodo se si verifica un errore
        }

        System.out.println("Inserisci l'età dello spettatore:");
        int eta = 0;
        try {
            eta = tastiera.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Errore: l'età deve essere un numero intero.");
            return; //Esce dal metodo se si verifica un errore
        }

        int idSpettatore = trovaIdSpettatore(nome, cognome, eta);
        if (idSpettatore != -1) {
            System.out.println("Lo spettatore con nome " + nome + ", cognome " + cognome + " e età " + eta + " ha ID: " + idSpettatore);
        } else {
            System.out.println("Lo spettatore non è stato trovato.");
        }
    }
}

package cinema.services;

import cinema.models.Spettatore;

import java.util.ArrayList;
import java.util.Scanner;

public class GestoreSpettatori extends GestoreBase<Spettatore> {


    public void aggiungiElemento () {
        Scanner tastiera2 = new Scanner(System.in);
        System.out.println("Buongiorno, inserisci i tuoi dati:");
        String nome1 = tastiera2.nextLine();
        String cognome1 = tastiera2.nextLine();
        int eta1 = tastiera2.nextInt();
        Spettatore spettatore = new Spettatore(nome1, cognome1, eta1);
        System.out.println("Utente creato con successo!");
        System.out.println("Il tuo ID utente è " + spettatore.getId());
        getListaElementi().add(spettatore);
    }

    public void rimuoviElemento () {
        Scanner tastiera6 = new Scanner(System.in);
        System.out.println("Inserisci l'ID dell'utente da eliminare");
        int idDaEliminare = tastiera6.nextInt();

        for (int i = 0; i < getListaElementi().size(); i++) {
            if (getListaElementi().get(i).getId() == (idDaEliminare)) {
                getListaElementi().remove(getListaElementi().get(i));
            }
        }
    }

    public void mostraLista(){
        System.out.println("!!!!!!!!!!!");
        for (Spettatore spettatore : getListaElementi()) {
            System.out.println(spettatore);
        }
    }
}

package cinema.services;

import cinema.models.Spettatore;

import java.util.ArrayList;
import java.util.Scanner;

public class GestoreSpettatori extends GestoreBase<Spettatore> {
//    public GestoreSpettatori () {
//        this.listaElementi = new ArrayList<>();
//    }


    public void aggiungiElemento ( Spettatore spettatore ) {
        Scanner tastiera2 = new Scanner(System.in);
        System.out.println("Buongiorno, inserisci i tuoi dati:");
        String nome1 = tastiera2.nextLine();
        String cognome1 = tastiera2.nextLine();
        int eta1 = tastiera2.nextInt();
        spettatore.setNome(nome1);
        spettatore.setCognome(cognome1);
        spettatore.setEta(eta1);
        getListaElementi().add(spettatore);
    }

    public void rimuoviElemento ( Spettatore spettatore ) {
        Scanner tastiera6 = new Scanner(System.in);
        tastiera6.next();
        System.out.println("Inserisci il nome dell'utente da eliminare");
        String nomeDaEliminare = tastiera6.nextLine();
        System.out.println("Inserisci il cognome dell'utente da eliminare");
        String conomeDaEliminare = tastiera6.nextLine();
        System.out.println("Inserisci l'età dell'utente da eliminare");
        int eta = tastiera6.nextInt();
        for (int i = 0; i < getListaElementi().size(); i++) {
            if (getListaElementi().get(i).getNome().equals(nomeDaEliminare) && getListaElementi().get(i).getCognome().equals(conomeDaEliminare) && getListaElementi().get(i).getEta() == (eta)) {
                getListaElementi().remove(spettatore);
            }
        }
    }

    public void mostraLista(){
        for (Spettatore spettatore : getListaElementi()) {
            spettatore.toString();
        }
    }
}

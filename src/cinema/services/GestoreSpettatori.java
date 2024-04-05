package cinema.services;

import cinema.models.Spettatore;

import java.util.ArrayList;
import java.util.Scanner;

public class GestoreSpettatori extends GestoreBase<Spettatore> {
    public GestoreSpettatori() {
        this.listaElementi = new ArrayList<>();
    }


    public void aggiungiElemento (Spettatore spettatore) {
        Scanner tastiera2 = new Scanner(System.in);
        System.out.println("Buongiorno, inserisci i tuoi dati:");
        String nome1 = tastiera2.nextLine();
        String cognome1 = tastiera2.nextLine();
        int eta1 = tastiera2.nextInt();
        spettatore.setNome(nome1);
        spettatore.setCognome(cognome1);
        spettatore.setEta(eta1);
        listaElementi.add(spettatore);
    }

    public void rimuoviElemento(Spettatore spettatore) {
        Scanner tastiera6 = new Scanner(System.in);
        tastiera6.next();
        System.out.println("Inserisci il nome dell'utente da eliminare");
        String nomeDaEliminare = tastiera6.nextLine();
        System.out.println("Inserisci il cognome dell'utente da eliminare");
        String conomeDaEliminare = tastiera6.nextLine();
        System.out.println("Inserisci l'età dell'utente da eliminare");
        int eta = tastiera6.nextInt();
        for (int i = 0; i < listaElementi.size(); i++) {
            if (listaElementi.get(i).getNome().equals(nomeDaEliminare) && listaElementi.get(i).getCognome().equals(conomeDaEliminare) && listaElementi.get(i).getEta()==(eta)) {
                listaElementi.remove(spettatore);
            }
        }
    }
}

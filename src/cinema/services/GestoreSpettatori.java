package cinema.services;

import cinema.models.Spettatore;

import java.util.ArrayList;
import java.util.Scanner;

public class GestoreSpettatori extends GestoreBase<Spettatore> {
    public GestoreSpettatori() {
        this.listaElementi = new ArrayList<>();
    }

    public void aggiungiElemento ( Spettatore spettatore ) {
        Scanner tastiera2 = new Scanner(System.in);
        System.out.println("Buongiorno, inserisci i tuoi dati:");
        String nome1 = tastiera2.nextLine();
        spettatore.setNome(nome1);
        String cognome1 = tastiera2.nextLine();
        spettatore.setCognome(cognome1);
        int eta1 = tastiera2.nextInt();
        spettatore.setEta(eta1);
        listaElementi.add(spettatore);
    }

    @Override
    public void rimuoviElemento(Spettatore spettatore) {
        listaElementi.remove(spettatore);
    }
}

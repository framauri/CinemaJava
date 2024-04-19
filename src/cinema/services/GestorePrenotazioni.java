package cinema.services;

import cinema.models.Film;
import cinema.models.Prenotazione;
import cinema.models.Sala;
import cinema.models.Spettatore;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Scanner;
import static cinema.Main.numeroPrenotazioni;

/**
 * Classe GestioneFilm
 * Classe che eredita i metodi da GestoreBase e li redefinisce per gestire la lista di film
 */

public class GestorePrenotazioni extends GestoreBase<Prenotazione> {

    /**
     * Metodo aggiungiElemento
     * Metodo per la creazione e l'aggiunta di una prenotazione alla lista di elementi
     * @param gestoreSpettatori
     * @param gestoreFilm
     * @param arraySale
     */

    public void aggiungiElemento ( GestoreSpettatori gestoreSpettatori, GestoreFilm gestoreFilm, Sala[] arraySale ) {
        try {
            Prenotazione prenotazione = new Prenotazione();

            Scanner tastiera7 = new Scanner(System.in);
            System.out.println("Benvenuto, creiamo una prenotazione:");

            int idUtente;
            boolean inputCorretto = false;

            if (!gestoreSpettatori.getListaElementi().isEmpty()) {
                while (!inputCorretto) {
                    System.out.println("Inserisci l'ID utente: ");
                    try {
                        idUtente = tastiera7.nextInt();
                        for (Spettatore ut : gestoreSpettatori.getListaElementi()) {
                            if (ut.getId() == idUtente) {
                                System.out.println("ID valido");
                                prenotazione.setSpettatore(ut);
                                inputCorretto = true;
                                break;
                            }
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Errore: devi inserire un numero intero.");
                        tastiera7.next();
                    }
                }
            } else {
                System.out.println("Lista vuota! Devi prima creare un'utenza!");
                gestoreSpettatori.aggiungiElemento();
                prenotazione.setSpettatore(gestoreSpettatori.getListaElementi().getFirst());
            }

            String nomeF;
            boolean inputCorrettoFilm = false;

            if (!gestoreFilm.getListaElementi().isEmpty()) {
                while (!inputCorrettoFilm) {
                    Scanner tastiera8 = new Scanner(System.in);
                    gestoreFilm.mostraLista();
                    System.out.println("Inserisci il titolo del film scelto: ");
                    try {
                        nomeF = tastiera8.nextLine();
                        for (Film film : gestoreFilm.getListaElementi()) {
                            if (Objects.equals(film.getTitolo(), nomeF)) {
                                System.out.println("Film esistente");
                                prenotazione.setFilm(film);
                                inputCorrettoFilm = true;
                                break;
                            }
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Errore: devi inserire un film esistente.");
                    }
                }
            } else {
                System.out.println("Lista vuota! Devi prima creare un film!");
                gestoreFilm.aggiungiElemento();

                prenotazione.setFilm(gestoreFilm.getListaElementi().getFirst());
            }

            Scanner tastiera9 = new Scanner(System.in);
            System.out.println("Sale disponibili:");
            for (Sala sala : arraySale) {
                System.out.println(sala.getNumero());
            }

            boolean salaTrovata = false;
            while (!salaTrovata) {
                try {
                    System.out.println("Inserisci il numero della sala:");
                    int numSala = tastiera9.nextInt();
                    for (Sala sala : arraySale) {
                        if (sala.getNumero() == numSala && sala.getCapacita() > 0) {
                            prenotazione.setSala(sala);
                            sala.setCapacita(sala.getCapacita() - 1);
                            salaTrovata = true;
                            break; //Esce dal ciclo una volta trovata una sala valida
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Errore: devi inserire una sala esistente.");
                }
            }

            boolean prenotazioneEsistente = false;
            for (Prenotazione pren : getListaElementi()) {
                if (pren.getSpettatore().equals(prenotazione.getSpettatore()) && pren.getFilm().equals(prenotazione.getFilm()) && pren.getSala().equals(prenotazione.getSala())) {
                    prenotazioneEsistente = true;
                    break;
                }
            }

            if (prenotazioneEsistente) {
                System.out.println("Questa prenotazione esiste già!");
            } else {
                getListaElementi().add(prenotazione);
                System.out.println("Prenotazione creata con successo!");
                numeroPrenotazioni++;
            }
        } catch (NoSuchElementException e) {
            System.out.println("---------------------------------");
        }
    }

    @Override
    public void aggiungiElemento () {
    }

    public void rimuoviElemento () {
        Scanner tastiera9 = new Scanner(System.in);
        System.out.println("Inserisci l'id della prenotazione da eliminare:");
        int idDaEliminare = tastiera9.nextInt();
        //For per trovare la prenotazione tramite id e, se esistente, la rimuove dalla lista
        for (int i = 0; i < getListaElementi().size(); i++) {
            if (getListaElementi().get(i).getId() == idDaEliminare) {
                System.out.println("Prenotazione con id " + getListaElementi().get(i).getId() + " eliminata!");
                getListaElementi().remove(getListaElementi().get(i));
            }
        }
    }

    public void mostraLista () {
        if (getListaElementi().isEmpty()) {
            System.out.println("Lista vuota!");
        } else {
            for (Prenotazione prenotazione : getListaElementi()) {
                System.out.println(prenotazione.formatoStampa());
            }
        }

    }

    public static void funFact () {
        System.out.println("Sono state create " + numeroPrenotazioni + " prenotazioni oggi");
        System.out.println("Significa che il nostro cinema sta fatturando!");
        System.out.println("                        ░░░░                      \n" +
                "                    ░░░░  ░░░░                    \n" +
                "                    ░░░░░░░░░░                    \n" +
                "                        ░░░░                      \n" +
                "                                                  \n" +
                "          ▒▒▒▒    ▒▒▒▒▒▒▒▒▒▒▒▒▒▒                  \n" +
                "          ▒▒░░▒▒▒▒░░░░░░░░░░░░░░▒▒▒▒              \n" +
                "          ▒▒▒▒▒▒░░░░░░▒▒▒▒▒▒▒▒░░░░░░▒▒            \n" +
                "        ▒▒░░░░░░░░▒▒▒▒░░░░░░▒▒▒▒░░░░▒▒            \n" +
                "        ▒▒░░██░░░░░░░░░░░░░░░░░░░░░░░░▒▒          \n" +
                "    ▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒        \n" +
                "    ▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒  ▒▒    \n" +
                "    ▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒      \n" +
                "      ▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒          \n" +
                "        ▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒          \n" +
                "          ▒▒▒▒░░░░░░░░░░░░░░░░░░░░▒▒▒▒            \n" +
                "            ▒▒▒▒▒▒░░░░░░░░░░░░▒▒▒▒▒▒              \n" +
                "            ▒▒░░░░▒▒▒▒▒▒▒▒▒▒░░░░░░▒▒              \n" +
                "            ▒▒▒▒▒▒            ▒▒▒▒▒▒              \n" +
                "                                                  \n" +
                "                                                  \n" +
                "██████████████████████████████████████████████████\n");
    }
}
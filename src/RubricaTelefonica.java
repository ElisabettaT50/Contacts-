import java.util.ArrayList;

public class RubricaTelefonica {
    private ArrayList<Contatto> listaContatti;

    public RubricaTelefonica() {
        this.listaContatti = new ArrayList<>();
    }

    public ArrayList<Contatto> getListaContatti() {
        return listaContatti;
    }

    public void aggiungiContatti(Contatto contatto) {
        listaContatti.add(contatto);
        System.out.println("Contatto " + contatto.getNome() + " aggiunto");
    }

    public void rimoviContatto(Contatto contatto) {
        if (listaContatti.contains(contatto)) {
            listaContatti.remove(contatto);
            System.out.println("Contatto " + contatto.getNome() + " rimosso");
        } else {
            System.out.println("Contatto " + contatto.getNome() + " non presente nella rubrica, impossibile rimuoverlo.");
        }
    }

    public void visualizzaContatti() {
        for (Contatto contatto : listaContatti) {
            contatto.stampaDettagli();
        }
    }

    public void cercaPerNome(String nome) {
        for (Contatto contatto : listaContatti) {
            if (nome.equals(contatto.getNome())) {
                System.out.println("Trovato un contatto che corrisponde alla ricerca " + nome);
                contatto.stampaDettagli();
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Contatto sara = new Contatto("Sara", "Rossi", "3334445556", "sara@mail.com");
        Contatto ilaria = new Contatto("Ilaria", "Verdi", "3335554447", "ilaria@mail.com");
        Contatto mario = new Contatto("Mario", "Neri", "3337778889", "mario@mail.com");
        Contatto andrea = new Contatto("Andrea", "Bianchi", "3339998881", "andrea@mail.com");

        RubricaTelefonica rubrica = new RubricaTelefonica();

        rubrica.aggiungiContatti(sara);
        rubrica.aggiungiContatti(ilaria);
        rubrica.aggiungiContatti(mario);
        rubrica.aggiungiContatti(andrea);

        sara.stampaDettagli();

        rubrica.rimoviContatto(mario);
        rubrica.rimoviContatto(mario);

        rubrica.visualizzaContatti();

        rubrica.cercaPerNome("Andrea");
    }
}
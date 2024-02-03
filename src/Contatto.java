public class Contatto {
    private String nome;
    private String cognome;
    private String numeroTelefono;
    private String email;
    public Contatto(String nome, String cognome, String numeroTelefono, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.numeroTelefono = numeroTelefono;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public String getEmail() {
        return email;
    }
    public void stampaDettagli() {
        System.out.println("Nome: " + nome + "\n" + "Cognome: " + cognome + "\n" + "Numero: " + numeroTelefono + "\n" + "Email:" + email);
    }

}

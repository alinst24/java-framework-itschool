package AccessControl;

public class Somer {

    public void metoda(){

        Persoana persoana = new Persoana();         // facem un obiect , fara mostenire a clasei
        persoana.metodaProtected();        // avem vizibile doar aceste metode , pe baza obiectului *dar in acelasi pachet
        persoana.metodaPublica();
    }
}

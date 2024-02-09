package AccessControl;

public class Student extends Persoana{

    public void metoda(){

        metodaProtected();       // cand am facut mostenirea , ne sunt vizibile doar 2 metode ; vizibilitatea este restransa in acelasi pachet
        metodaPublica();
    }
}

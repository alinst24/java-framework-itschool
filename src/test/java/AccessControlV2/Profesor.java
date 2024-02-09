package AccessControlV2;

import AccessControl.Persoana;

public class Profesor {

    public void metoda(){

        Persoana persoana = new Persoana();        // nu aplicam mostenire si facem un obiect
        persoana.metodaPublica();             // nu mai putem apela protected-ul ; deci protected-ul are vizibilitate la mostenire in acelasi sau alt pachet , insa cand vine vorba de obiect are vizibilitate ca obiect doar in acelasi pachet
    }
}

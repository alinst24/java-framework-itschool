package AccessControlV2;

import AccessControl.Persoana;

public class Sportiv extends Persoana {

    public void metoda(){

        metodaProtected();        // deci daca aplicam mostenirea pe acces controluri , nu exista diferenta indiferent ca vorbim de acelasi pachet sau altul ; deci mostenirea merge peste tot : public si protected
        metodaPublica();
    }
}

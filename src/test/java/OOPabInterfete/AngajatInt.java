package OOPabInterfete;

public interface AngajatInt {


    // Abstractizare = conceptul pe baza caruia definim comportamentul unei clase     (o persoana angajat si o persoana student , fiecare are un comportament propriu ; un angajat merge la servici,munceste,primeste bani ; dar studentul merge la facultate,are cursuri,are examene)
    // Conceptul de abstractizare se poate face in 2 feluri : folosind interfete sau clase abstracte
    // Putem recunoaste o interfata dupa cuvantul "interface"
    // O interfata contine doar metode abstracte (metode care nu au body) ( care nu au acoaladele)
    // O interfata se implementeaza ( clasele se mostenesc)
    // Clasa care implementeaza interfata trebuie sa implementeze toate metodele abstracte
    // O clasa poate implementa "n" interfete    ;     !!! in Java o clasa poate mosteni o singura clasa.   DAR daca totusi avem nevoie sa mostenim mai multe  , putem defini cu ajutorul interfetelor un comportament comun de la mai multe clase
    // O clasa abstracta poate implementa una sau mai multe interfete
    // O interfata nu poate extinde o clasa / clasa abstracta
    // O interfata poate extinde o alta interfata
    // Toate metodele dintr-o interfata sunt publice
    // Interfata nu poate avea un constructor => nu putem face un obiect dintr-o interfata


    // nu punem public pt ca sunt publice by default si nu au nici body ( { } )
    void munceste();

    void primesteSalariu();

    void areConcediu();




}

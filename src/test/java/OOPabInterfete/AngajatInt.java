package OOPabInterfete;

public interface AngajatInt {

    // Abstractizare = conceptul pe baza caruia definim comportamentul unei clase
    // Acest concept se poate face prin interfete sau clase abstracte
    // Putem recunoaste o interfata dupa cuvantul "interface"
    // O interfata contine doar metode abstracte (metode care nu au body)
    // O interfata se implementeaza
    // Clasa care implementeaza interfata trebuie sa implementeze toate metodele abstracte
    // O clasa poate implementa "n" interfete
    // O clasa abstracta poate implementa una sau mai multe interfete
    // O interfata nu poate extinde o clasa / clasa abstracta
    // O interfata poate extinde o alta interfata
    // Toate metodele dintr-o interfata sunt publice
    // Interfata nu poate avea un constructor => nu putem face un obiect dintr-o interfata


    void munceste();

    void primesteSalariu();

    void areConcediu();




}

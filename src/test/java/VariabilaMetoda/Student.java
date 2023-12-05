package VariabilaMetoda;

import org.testng.annotations.Test;

public class Student {
// exemplu de comentariu
    //! clasa = sablon care contine atribute si metode
    // intr-un fisier java putem avea "n" clase , insa trebuie sa le diferentiem dupa nume; identificam o clasa dupa cuvantul class,iar continutul ei se gaseste intre acolade
    // practica sugereaza sa avem o singura clasa intr-un fisier java (dar se pot si mai multe)

    //! variabila = atributul unei clase
    // variabilele pot sa fie de 2 feluri : global si local
    // variabila globala = este vizibila peste tot in proiectul nostru (in clasa)
    // variabila locala = este vizibila doar in locul unde a fost declarata
    // variabila globala = public tip de data + nume variabila
    // variabila poate sau nu sa primeasca o valoare

    //! metoda = actiunea unei clase ; deschide mereu paranteze rotunde
    // metodele sunt de 2 feluri : void si return
    // metoda cu void = cel mai des folosita pentru ca accesam mult mai rapid rezultatul; executa si arata actiunea
    // metoda cu return = doar returneaza actiunea ; returneaza actiunea si te lasa sa decizi ce sa faci mai departe cu ea



    // aici jos unde scrie"nume , prenume etc" de obicei se scrie cu litera mica

    public String Nume; // String o folosim pentru litere
    public String Prenume;
    public Integer Varsta; // Integer o folosim pentru numere intregi
    public String Adresa;
    public Integer Telefon;
    public Double Greutate; //Double o folosim pentru valori cu multe zecimale
    public Float Inaltime; //Float e asemanatoare cu double dar o folosim cand avem valori cu putine zecimale
    public Character Gen; // M sau F ; iar pentru masculin/feminin puteam folosi string
    public Boolean AreBursa; // true sau false


    // facem o metoda de test:

    @Test
    public void metodatest(){
AtribuireValori();
CalculMedie("Semestrul 1",9.25,6.50);
CalculMedie("Semestrul 2",8.00,7.50);
CalculPret(10);
CalculPret(20);
    }
    public void AtribuireValori (){
        Nume = "Stanciu";
        Prenume = "Alin-Georgian";
        Varsta = 25;
        Adresa = "Str. Oborului, Bl. AB4 , Scara 1 , Ap.16";
        Telefon = 12312312;
        Greutate = 80.5;
        Inaltime = 174.5f;
        Gen = 'M';
        AreBursa = true;


        // afisam valoarea unei variabile
        //System.out.print(Nume+ " ");
        //System.out.print(" ");

        System.out.println(Nume+" "+Prenume+" "+Varsta+" ani");
  //println pune un spatiu intre randuri ; iar print scrie in continuare
        System.out.println("Adresa studentului este:"+Adresa);
        System.out.println("Telefonul studentului este "+Telefon);
        System.out.println("Greutatea studentului este "+Greutate);
        System.out.println("Inaltimea studentului este "+Inaltime);
        System.out.println("Genul studentului este "+Gen);
        System.out.println("Are studentul bursa? "+AreBursa);

        // ' ' = pentru un caracter si " " pentru mai mutle caractere.



    }

    // variabilele locale se declara direct cu functia respectiva (ex: double rezultat =...)
    // la metoda in paranteze putem sa declaram valorile , iar sus putem scrie alt public void unde executam metodele respective
    public void CalculMedie (String tipnote, Double nota1, Double nota2){
        Double Rezultat = (nota1 + nota2)/2;
        System.out.println("Media examenelor este la "+tipnote+" este "+Rezultat);
    }


public void CalculPret (Integer reducere){
        Integer pret = 1000;
    System.out.println("Pretul initial al cursului este "+ pret);
    Integer diferentapret= (pret*reducere)/100;
    Integer pretfinal = pret - diferentapret;
    System.out.println("Pretul dupa reducere al cursului este "+pretfinal);
}

}

package OOPabInterfete;

public class Persoana {

// Chestii comune si pentru angajat si pentru student

    // Incapsulare:   facem variabilele cu acces control private, nu public
    private String nume;

    private String prenume;

    private Integer varsta;

    // Pt ca vrem sa facem un obiect avem nevoie de un constructor :

    public Persoana(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    // Si vrem sa facem anumite modificari si accesari : getteri(la toate ca vrem sa accesam valorile) si setteri tot la toate(ex: daca anul asta are 25 ani , la anul 26 si vrem sa modificam)
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    // O metoda prin care descriem persoana ; definim la mod general , pentru ca vor fi comune si pentru angajat si pt persoana si putem apoi sa folosim polimorfismul dinamic
    public void infoPersoana(){
        System.out.println("Numele este : "+getNume());
        System.out.println("Prenumele este : " +getPrenume());
        System.out.println("Varsta este: "+getVarsta());
    }
}

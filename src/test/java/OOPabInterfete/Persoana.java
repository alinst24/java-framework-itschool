package OOPabInterfete;

public class Persoana {

    private String nume;

    private String prenume;

    private Integer varsta;

    public Persoana(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

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

    public void infoPersoana(){
        System.out.println("Numele este : "+getNume());
        System.out.println("Prenumele este : " +getPrenume());
        System.out.println("Varsta este: "+getVarsta());
    }
}

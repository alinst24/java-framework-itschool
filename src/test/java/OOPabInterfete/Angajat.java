package OOPabInterfete;

public class Angajat extends Persoana implements AngajatInt{


    public Angajat(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul munceste.");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Angajatul a primit salariul.");
    }

    @Override
    public void areConcediu() {
        System.out.println("Angajatul a luat concediu.");
    }
}

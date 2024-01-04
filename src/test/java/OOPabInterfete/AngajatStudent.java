package OOPabInterfete;

public class AngajatStudent extends Persoana implements StudentInt,AngajatInt{
    public AngajatStudent(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }


    @Override
    public void munceste() {
        System.out.println("Angajatul Student merge la munca.");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Angajatul Student primeste salariu");
    }

    @Override
    public void areConcediu() {
        System.out.println("Angajatul Student isi ia concediu.");
    }

    @Override
    public void mergeLaFacultate() {
        System.out.println("Angajatul Student merge la facultate.");
    }

    @Override
    public void sustineExamene() {
        System.out.println("Angajatul Student sustine examen.");
    }

    @Override
    public void mergeInVacanta() {
        System.out.println("Angajatul Student merge in vacanta.");
    }

    @Override
    public void mergeInRestante() {
        System.out.println("Angajatul Student sustine restanta.");
    }
}

package OOPabInterfete;


// Mai poate exista si o alta situatie : un student angajat (deci este important ca aceasta categorie sa aiba drepturile si de la unul si de la celalat)
public class AngajatStudent extends Persoana implements StudentInt,AngajatInt{
    public AngajatStudent(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

// Astfel, cand dam implements methods : trebuie sa contina comportamentele de la amandoua :
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






// Tema : as vrea sa deschid niste restaurante dar am facut un studiu si am obs ca nu as putea sa zic cu exactitate care estea cea mai buna categorie de consumatori sa o targetez (vegan sau non vegan) ; sa deschid 3 restaurante 1 vegan 1 non vegan si 1 cu aman2, cum ar trebui sa fac cu interfetele astea? Trebuie un bucatar specializat pt fiecare( sa stabilim un meniu - vegan sau non vegan, mixt, deci vom avea 2 interfete , ca cea mixta le va lua pe aman2)
package OOPabInterfete;

// un angajat sa poata sa primeasca proprietatile unei persoane : extends(mostenire)
// !! Daca un copil mosteneste parintele, copilul trebuie sa se asigure ca apeleaza constructorul din parinte ! ( cu super)

// facem clasa aceasta sa implementeze interfata : cu "implements" , si apoi implementam metodele (!toate, ca altfel nu functioneaza) (stand cu mouseul pe sublinierea rosie)
public class Angajat extends Persoana implements AngajatInt{


    public Angajat(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    // Apoi trebuie sa fortam ca orice obiect care se va face din aceasta clasa sa respecte un anumit comportament : (am facut o clasa noua cu "interface: AngajatInt")

    // override = polimorfism dinamic    ; orice angajat trebuie sa : munceasca, primeasca salariu , aiba concediu (astfel am definit un comportament si am fortat orice obiect sa il respecte)
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

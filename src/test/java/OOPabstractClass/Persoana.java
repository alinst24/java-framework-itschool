package OOPabstractClass;

public abstract class Persoana {

        // Sa facem o clasa sa fie abstracta adaugam cuvantul "abstract" intre public si class
    // O clasa abstracta poate sau nu sa contina metode abstracte
    // O clasa abstracta se mosteneste
    // O clasa abstracta poate implementa o interfata
    // O clasa abstracta poate avea un constructor , insa nu putem face un obiect
    // Putem avea metode / variabile cu diferite tipuri de access control (private,public,protected)
    // Metodele abstracte trebuie sa contina cuvantul "abstract"
    // Trebuie sa specificam acces control pentru metodele abstracte

   public abstract void munceste();

   public abstract void primesteSalariu();

    public abstract void areConcediu();

    public abstract void mergeLaFacultate();

    public abstract void sustineExamene();

    public abstract void mergeInVacanta();

    public abstract void mergeInRestante();

    public void verificaVarsta(Integer varsta){

        if (varsta>=18){
            System.out.println("Persoana este majora.");
        }
        else{
            System.out.println("Persoana este minora.");
        }
    }
}

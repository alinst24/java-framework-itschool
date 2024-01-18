package OOPabInterfete;

public class Student extends Persoana implements StudentInt{
    public Student(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    // si astfel cand implementam ne va da numarul(respectiv 4)de metode abstracte specifice de acest Student
    @Override
    public void mergeLaFacultate() {
        System.out.println("Studentul merge la facultate.");
    }

    @Override
    public void sustineExamene() {
        System.out.println("Studentul sustine examen.");
    }

    @Override
    public void mergeInVacanta() {
        System.out.println("Studentul merge in vacanta.");
    }

    @Override
    public void mergeInRestante() {
        System.out.println("Studentul sustine restanta.");
    }
}

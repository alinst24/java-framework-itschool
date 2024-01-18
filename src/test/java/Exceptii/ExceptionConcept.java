package Exceptii;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionConcept {

    // Exceptie = eroare care apare in momentul cand programul ruleaza
    // Exceptiile trebuie tratate deoarece pot sa contina informatii din interior care pot sa fie exploatate
    // Poate sa apara o exceptie cand vrem sa citim un fisier
    // Citim datele dintr-un tabel din DB care nu exista
    // Exceptiile sunt de 2 tipuri : checked si unchecked
    // CHECKED = exceptii care se trateaza in timpul compilarii
    // Acest tip de exceptii mostenesc clasa Exception
    // UNCHECKED = exceptii care nu se trateaza in timpul compilarii
    // Acest tip de exceptii mostenesc clasa Runtime Exception
    // Exista 2 keywords foarte importante pentru a trata exceptiile : throw si throws
    // Orice tip de exceptie se trateaza folosind structura try...catch...finally

    public void checkedExample(String path){

        File file = new File(path);
        try{
            FileInputStream fileInputStream = new FileInputStream(file);
            System.out.println("Am gasit fisierul.");
        }
        catch (FileNotFoundException exception){
            System.out.println("A intrat pe clauza catch.");
        }
        finally {
            System.out.println("A mai incercat o data sa gaseasca fisierul.");
        }
    }

    public void uncheckedExampleV1(){

        System.out.println("Acest cod o sa produca o exceptie.");
        Integer calcul=7/0;
        System.out.println(calcul);
    }

    public void uncheckedExampleV2(){

        String [] colegi = new String[2];
        colegi[0]="Alin";
        colegi[1]="Alin1";
        colegi[2]="Alin2";
        System.out.println("Acest cod o sa produca o exceptie.");
        for (Integer index=0;index<colegi.length;index++){
            System.out.println(colegi[index]);
        }
    }

    // "throw" : keyword folosit sa arunce o exceptie specifica
    // Se regaseste in interiorul unei metode

    public void verificaVarsta(Integer varsta){

        if (varsta<18){
            throw new RuntimeException ("Nu iti dau tigari ca esti minor.");
        }
        else {
            System.out.println("Iti dau ca esti major.");
        }
    }

    // "throws" : keyword folosit in semnatura metodei ca sa arate faptul ca o metoda poate sa arunce o exceptie
    // Poate sa fie urmat de o multime de exceptii delimitate cu virgula

    public void throwsExample(String path) throws FileNotFoundException {

        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);
        System.out.println("Am gasit fisierul.");
    }
}

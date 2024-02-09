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

    public void checkedExample(String path){            // exceptie de tip checked

        File file = new File(path);
        try{
            FileInputStream fileInputStream = new FileInputStream(file);                 // logica : prin aceasta linie incercam sa gasim fisierul
            System.out.println("Am gasit fisierul.");
        }
        catch (FileNotFoundException exception){           // Ce exceptie vrem sa prindem = daca nu stim putem sa stam cu mouseul unde apare rosu (ex: FileInputStream(file) ) si sa vedem care este exceptia
            System.out.println("A intrat pe clauza catch.");
        }
        finally {  // finally = cand suntem intr-o situatie cand vrem sa facem o conexiune si il punem in "try" sa astepte 5 secunde si apoi sa se conecteze, dar de fapt dureaza mai mult de 5 secunde; in acest caz finally mai incearca o data(mai da o sansa, finala, adica mai baga inca 5 secunde sa incerce)(orice se intampla finally se executa ; finally este optional)!!!!!!
            System.out.println("A mai incercat o data sa gaseasca fisierul.");
        }
    }

    // Scurtatura la acest cod este sa tinem mouse-ul pe cod unde este subliniat cu rosu si dam > More actions>Surround with try and catch = se trasnforma in checked exception      (si va trebui sa stergem "throw new Runtime...")

    public void uncheckedExampleV1(){

        System.out.println("Acest cod o sa produca o exceptie.");
        Integer calcul=7/0;               // incercam sa impartim un numar la 0
        System.out.println(calcul);
    }

    public void uncheckedExampleV2(){

        String [] colegi = new String[2];     // Acesta este un Array care vede doar 2 elemente , nu pozitii, deci nu accepta 3 ci 2 pozitii.
        colegi[0]="Alin";
        colegi[1]="Alin1";
        colegi[2]="Alin2";
        System.out.println("Acest cod o sa produca o exceptie.");
        for (Integer index=0;index<colegi.length;index++){           // aici parcurgem multimea noastra
            System.out.println(colegi[index]);
        }
    }

    // "throw" : keyword folosit sa arunce o exceptie specifica
    // Se regaseste in interiorul unei metode

    public void verificaVarsta(Integer varsta){

        if (varsta<18){
            throw new RuntimeException ("Nu iti dau tigari ca esti minor."); // Sa arunce o exceptie daca nu indeplineste conditia   ; Cand nu stim ce exceptie vrem sa arunce : dam RuntimeException  +mesajul
        }
        else {
            System.out.println("Iti dau ca esti major.");
        }
    }

    // "throws" : keyword folosit in semnatura metodei ca sa arate faptul ca o metoda poate sa arunce o exceptie
    // Poate sa fie urmat de o multime de exceptii delimitate cu virgula
    // ** Dam cu mouse pe sublinierea rosie si dam " add exception...." si apare codul "throws FileNotFoundException" la "METHOD SIGNATURE" , asa se numeste acea zona!!
    // *** SA NU IL FOLOSIM , deoarece acel cod "throws FileNotFoundException" trebuie sa o copiem peste tot unde folosim metoda

    public void throwsExample(String path) throws FileNotFoundException {

        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);
        System.out.println("Am gasit fisierul.");
    }
}

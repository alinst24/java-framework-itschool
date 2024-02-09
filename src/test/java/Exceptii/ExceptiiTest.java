package Exceptii;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class ExceptiiTest {

    @Test
    public void checkedExceptionType(){

        ExceptionConcept exceptionConcept = new ExceptionConcept();                // Facem un obiect din clasa respectiva
        exceptionConcept.checkedExample("src/test/java/Exceptii/document.txt");       //caz in care path-ul este corect , si o sa intre pe try
        exceptionConcept.checkedExample("src/test/ja/Exceptii/document.txt");      // cazul in care merge pe catch
    }

    // facem alte metode de test pentru ca daca le rulam pe toate vor pica de la primele si urmatoarele nu vor mai rula
    @Test
    public void uncheckedExceptionType(){

        ExceptionConcept exceptionConcept = new ExceptionConcept();
        exceptionConcept.uncheckedExampleV1();
    }

    @Test
    public void uncheckedExceptionTypeV2(){

        ExceptionConcept exceptionConcept = new ExceptionConcept();
        exceptionConcept.uncheckedExampleV2();
    }

    @Test
    public void throwException(){

        ExceptionConcept exceptionConcept = new ExceptionConcept();
        exceptionConcept.verificaVarsta(20);
        exceptionConcept.verificaVarsta(15);
    }

    // !!!   In automation :
// Ex : Atunci cand facem o inregistrare pe o pagina si apoi ne apare un mesaj pe o alta pagina(ca a fost inregistrare cu succes)
// In acest caz putem folosi pentru validare Assert-uri (declarand elementul = mesajul) si sa vedem daca acest mesaj exista.          SAAAAAUUUUU putem :
// Sa declaram elementul si sa spunem : Daca textul NU EXISTA ==>> throw new RuntimeException ("Nu a aparut mesajul") , altfel , fa assert-ul respectiv

    @Test
    public void throwsException() throws FileNotFoundException {          // Si aici trebuie mereu sa caram dupa noi acest cod in method signature         ; si daca mai erau si alte exceptii se adaugau in continuare aici in method signature

        ExceptionConcept exceptionConcept = new ExceptionConcept();
        exceptionConcept.throwsExample("");
    }
}



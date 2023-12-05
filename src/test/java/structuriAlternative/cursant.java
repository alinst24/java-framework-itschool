package structuriAlternative;

import org.testng.annotations.Test;

public class cursant {
    // structurile pot fi de 2 feluri : alternative si repetitive
    //structuri alternative: if...then...else,switch .... case

// "+...+" se numeste concatenare

    //verificam daca un numar este mai mare decat 5
    @Test
    public void metodaTest() {
//        verificareNumar(5);
//        verificareNumar(6);
//        verificareNumar(4);
//        verificareNumar(0);
//        verificareNumar(15);
//        verificareNumar(-10);
//        verificareNumar(-1);


//        verificNrPar(1);
//        verificNrPar(2);
//        verificNrPar(-10);
//        verificNrPar(0);
//        verificNrPar(-3);
//        verificNrPar(60000);
//        verificNrPar(3333333);

        persoanaMajora(17);
        persoanaMajora(19);
        persoanaMajora(18);





        // ctrl+/ pentru a comenta mai multe randuri
    }

    public void verificareNumar(Integer numar) {
        if (numar > 5) {
            System.out.println("Numarul " + numar + " este mai mare ca 5");
        } else {
            System.out.println("Numarul " + numar + " este mai mic decat 5");
        }
    }


    // verificam daca un numar este par( daca la impartirea cu 2 are restul 0) si pozitiv         ; %2==0 pentru par si %2 != 0 pentru impar

    public void verificNrPar(Integer nr) {
        // daca vrem catul punem "/" (div) , daca vrem restul punem "%"(mod) ;    && = and
        if (nr > 0) {
            if (nr % 2 == 0) {
                System.out.println("Numarul " + nr + " este par si pozitiv");
            } else {
                System.out.println("Numarul " + nr + " este impar si pozitiv");
            }
            // daca vrem sa tratam o conditie si sa mergem mai departe cu alta conditie : folosim else if; la if ii trebuie conditie , iar la else nu ii trebuie , iar if poate sa functioneze fara else , insa else fara if nu
        } else if (nr < 0) {
            if (nr % 2 == 0) {
                System.out.println("Numarul " + nr + " este par si negativ");
            } else {
                System.out.println("Numarul " + nr + " este impar si negativ");
            }
        } else {
            System.out.println("Numarul "+nr+" este egal cu zero");
        }
    }


    //verificam daca o persoana este majora
    public void persoanaMajora(Integer varsta){
        if (varsta >= 18) {
            System.out.println("Persoana cu varsta de "+varsta+" ani este majora");
        }
        else{
            System.out.println("Persoana cu varsta de "+varsta+" ani nu este majora");
        }
    }

}









//tema : un nr si sa verificam daca numarul este intre intervalul 7-10 ; si mai sus , putem face mai intai cu pare si apoi pozitive                  : ex: un integer , nr sa fie mai mare sau egal cu 8 si mai mic sau egal cu 15 si apoi testez numere si else : sa fie in afara intervalului

// ctrl+alt+l iti aranjeaza automat codul frumos
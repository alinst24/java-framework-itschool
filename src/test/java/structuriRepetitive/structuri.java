package structuriRepetitive;

import org.testng.annotations.Test;

public class structuri {
    // structuri repetitive: while , for, for each, do while
    // for :de unde pornesc, unde ma opresc , din cat in cat cresc valoarea

    @Test
    public void metodaTest() {
        //afisamNumereFor();
        //afisareNumereWhile();
        //afisareNume();
        //sumaNumere();
        numereDivizibileCu5();
//afisamNumerePare(100);
    }

    //afisam primele 50 numere
    public void afisamNumereFor() {
        // primul nr mereu e 0 ! asa incepe numerotarea  , deci daca afisam primele 10 numere, sunt 11 , inclusiv 0
        // for trebuie sa stie (De la cat pornim, pana unde mergem , cu cat crestem)        ; index = inceput   index++ =      index+index+1      ; Daca vrem din 2 in 2 : index+2
        for (Integer index = 0; index < 50; index++) {
            System.out.println(index);
        }
    }


    // afisare numere cu while

    public void afisareNumereWhile() {
        Integer index = 0;
        while (index < 50) {
            System.out.println(index);
            index++;
        }
    }


    // afisam numele nostru de 5 ori cu for    (dar merge si cu while)

    public void afisareNume() {
        for (Integer index = 0; index < 5; index++) {
            System.out.println("Numele meu este Stanciu Alin");
        }
    }


    //calculam suma primelor 10 numere (   0 se considera null;     o facem cu while)

    public void sumaNumere() {
        Integer index = 0;
        Integer suma = index;
        while (index <= 10) {
            suma = suma + index;
            index++;
            // nu punem sout in while ca o sa ne dea de fiecare data

        }
        System.out.println("Suma numerelor este " + suma + ".");
    }


    // afisam primele 3 numere divizibile cu 5
    public void numereDivizibileCu5() {
        Integer contor = 0;
        for (Integer index = 0; index < 100; index++) {
            if (index % 5 == 0 && contor<3) {
                contor++;
                System.out.println("Numarul " + index + " este divizibil cu 5.");
            }
            // asta de jos e acelasi lucru ca mai sus          (dar fara contor <3 la if )
//            if (contor == 3) {
//                break;
//            }
        }
    }









    // afiseaza numerele pare si divizibile cu 10 -  de la 0 la 100
    public void afisamNumerePare (Integer lungime){
        for(Integer inceput=0;inceput<=100;inceput++) {
            if (inceput%2==0 && inceput%10==0) {
                System.out.println(inceput);
            }
        }
    }
}

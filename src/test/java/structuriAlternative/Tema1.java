package structuriAlternative;

import com.google.errorprone.annotations.Var;
import org.testng.annotations.Test;

public class Tema1 {
    //tema : un nr si sa verificam daca numarul este intre intervalul (7-15] ;

    @Test
    public void verificare() {
        //Mesaj1();
        //Varsta();
//NumePrenume();
        //dataAstazi();
        //calcul();
//afisare1(2.5,3.3,5.5);
//produsnumere(4,3);
        //produsnumere2();
        //adaugare1();
        //adaugare2();
       // fraza();
        //cerinta14();





        //verificareNumar(6);
//verificareNumar(7);
//verificareNumar(5);
//verificareNumar(15);
//verificareNumar(14);
//verificareNumar(16);
//verificareNumar(-1);
//verificareNumar(100);
//verificareNumar(0);

//        Numere(1);
//        Numere(2);
//        Numere(0);
//        Numere(-1);
//        Numere(-10);
//        Numere(10);
//        Numere(5);
//        Numere(4);
//
//
//
    }

    // Cerinta 1.              a
    public void Mesaj1() {
        System.out.println("Hello World");
    }


    // Cerinta 2.
    public void Varsta() {
        Integer varsta = 25;
        System.out.println(varsta);
    }


    //Cerinta 3.
    public void NumePrenume() {
        String nume = "Stanciu";
        String prenume = "Alin-Georgian";
        System.out.println(nume);
        System.out.println(prenume);
    }


    //Cerinta 4.
    public void dataAstazi() {
        String data = "1/13/2019";
        String ora = "18:30 PM";
        String zi = "Joi";
        System.out.println(data);
        System.out.println(ora);
        System.out.println(zi);

    }


    //cerinta 5.
    public void calcul() {
        Double rezultat = (2 + (3 * 4) - 3) / 3.0;
        System.out.println("Rezultatul corect este: "+rezultat+"");
    }
// !!!!! aici merge si cu float sau integer (in functie decate zecimale vrem), iar cu double ca sa functioneze : bagam o zecimala la final ex : 3.0;            !! Pentru mai multe calcule folosim tot paranteze rotunde.


    //cerinta 6.

public void afisare1(Double a, Double b, Double c){
        Double suma= a+b+c;
        System.out.println("Suma numerelor este "+suma+".");
}




//cerinta 7.
    public void produsnumere(Integer nr1, Integer nr2){
        Integer produs= nr1*nr2;
        System.out.println(produs);
    }



    // cerinta 8.

    public void produsnumere2(Integer nr1, Integer nr2) {
        String mesaj="Stiu ca am calculat bine ";
        System.out.print(mesaj);
        produsnumere(5,7);
        System.out.println(mesaj);
        afisare1(3.5,6.5,9.7);


    }





    // cerinta 9.
    public void adaugare1(){
        System.out.println("Salut"+ "M");
    }


    // cerinta 10.
    public void adaugare2(){
        System.out.println("H"+"Salut");
    }



    //cerinta 11.
    public void fraza(){
        System.out.println("Ana"+"Z"+" are"+"Z"+ " mere"+"Z"+" ,pere"+"Z"+" ,prune"+"Z"+".");
    }



    //cerinta 12.

// cu // sau ctrl+/


    //cerinta 13.

//tot cu ctrl+/



    //cerinta 14.

    public void cerinta14(){
        System.out.println(" Poti pleca acasa dupa ce iti verific munca!");
    }



















    // cerinta bonus : verifica daca un numar se afla in invervalul (7-15]

    public void verificareNumar(Integer numar) {
        if (numar > 7 && numar <= 15) {
            System.out.println("Numarul " + numar + " se afla in intervalul 7-15.");
        } else {
            System.out.println("Numarul " + numar + " nu se afla in intervalul 7-15.");
        }
    }





    // cerinta bonus : verificam daca un numar este mai intai par/impar si apoi pozitiv/negativ
    public void Numere(Integer nr) {
        if (nr == 0) {
            System.out.println("Numarul " + nr + " este egal cu zero.");
        } else if (nr % 2 == 0) {
            if (nr > 0) {
                System.out.println("Numarul " + nr + " este par si pozitiv.");
            } else {
                System.out.println("Numarul " + nr + " este par si negativ.");
            }
        } else if (nr % 2 != 0) {
            if (nr > 0) {
                System.out.println("Numarul " + nr + " este impar si pozitiv.");
            } else {
                System.out.println("Numarul " + nr + " este impar si negativ.");
            }
        }
    }
}















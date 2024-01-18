package ValuetypeReferencetype;

import org.testng.annotations.Test;

public class Vacanta {

    public Integer value1 = 10;
    public String value2="Alin";
    // Primitive: int, boolean, char, float, double, short, long      (raman la valoarea intiala)
    // Non-primitive : restul(String-ul !!,multimi(array,liste,hashmap,),objects) (Integer,Boolean,Double,Char...)

    // Primitivele isi pierd modificarile in momentul cand ies din metoda respectiva, pe cand referencetype(adica non-primitivele) isi pastreaza modificarea
    public static Integer value3=10;           // static metine valoarea la o primitiva     ; final = valoarea finala pe care o adaugam , nu mai poate sa fie modificata
    public final Integer value4=5;


    public void changeStaticType(Integer x) {

        value3 =value3+ x;
        System.out.println("Noua valoare este: " + x);
    }

    @Test
    public void metodaTest() {

        changeValueType(value1);
        System.out.println("Valoarea acteuala este :" +value1);
        changeStringType(value2);
        System.out.println("Valoarea actuala este :"+value2);
        changeStaticType(value3);
        System.out.println("Valoarea actuala este :" +value3);

        //value4=value4+5;             pt ca este final nu putem sa ii mai dam valoare
    }

    public void changeValueType(Integer x) {

        x =x+ 20;
        System.out.println("Noua valoare este: " + x);
    }

    public void changeStringType(String y){

        value2=value2+y;
        System.out.println("Noua valoare este: "+value2 );
    }
}

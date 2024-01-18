package ValuetypeReferencetype;

import org.testng.annotations.Test;

public class Concediu {

    public Integer value1;
    public int value2;
    public Double value3;
    public double value4;

    @Test
    public void metodaTest(){
        value1=10;
        value2=10;
        value3=10.0;
        value4=10.0;

        // Variabilele cand vrem sa le definim sunt de 2 categorii : primitive si non-primitive      (adica valuetype= isi pastreaza valoarea initiala si referencetype)
        // value1.  -- putem sa apelam anumite metode
        // value2. nu putem, deoarece sunt primitive  ( in general sunt folosite doar sa tina valoarea si atat)
    }

}

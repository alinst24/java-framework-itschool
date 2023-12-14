package StaticKeyword;

import org.testng.annotations.Test;

public class StaticTest {

    @Test

    public void metodaTest(){
        Elev elev = new Elev("Popescu","Ciprian");
        elev.prezentareElev();

        Elev elev2 = new Elev("Popescu2","Ciprian2");
        elev2.prezentareElev();

        Elev elev3 = new Elev("Popescu3","Ciprian3");
        elev3.prezentareElev();
    }
}

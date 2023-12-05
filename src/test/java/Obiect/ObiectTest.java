package Obiect;

import org.testng.annotations.Test;

public class ObiectTest {
    @Test
    public void testMethod(){

        // Obiect - nume = new (initializam constructorul clasei) ...( si apoi valori pentru parametrii)
        FabricaMasini Mercedes_G63_AMG = new FabricaMasini("Mercedes","G63 AMG","Electric","Manuala",2023,4.89);
        // Apoi chemam obiectul si apasam "." si ne da proprietatile pe care le-am facut.
        Mercedes_G63_AMG.prezentareProdus();
        Mercedes_G63_AMG.calculImpozit();
        System.out.println("============================================================================================");

        FabricaMasini DaewooMatiz = new FabricaMasini("Daewoo","Matiz","GPL","Manuala",2003,0.8);
        DaewooMatiz.prezentareProdus();
        DaewooMatiz.calculImpozit();
        System.out.println("============================================================================================");

        FabricaMasini AudiR8= new FabricaMasini("Audi","R8","Electric","Manuala",2022,3.2,99000);
        AudiR8.prezentareProdus();
        AudiR8.calculImpozit();

    }
}

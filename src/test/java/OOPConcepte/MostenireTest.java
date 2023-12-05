package OOPConcepte;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MostenireTest {

    @Test
    public void testMethod(){

        List<String> dotariAudiA5= new ArrayList<>();
        dotariAudiA5.add("Jenti");
        dotariAudiA5.add("Trapa");
        dotariAudiA5.add("Faruri");

        List<String> dotariAudiA7= new ArrayList<>();
        dotariAudiA7.add("Jenti");
        dotariAudiA7.add("Trapa");
        dotariAudiA7.add("Spoiler");
        dotariAudiA7.add("Oglinzi electrice");

        List<String> dotariBMWX5interior= new ArrayList<>();
        dotariBMWX5interior.add("Incalzire scaune");
        dotariBMWX5interior.add("Clima bizonica");
        dotariBMWX5interior.add("GPS");

        List<String> dotariBMWX7exterior= new ArrayList<>();
        dotariBMWX7exterior.add("Jenti");
        dotariBMWX7exterior.add("Trapa");
        dotariBMWX7exterior.add("Spoiler");
        dotariBMWX7exterior.add("Oglinzi electrice");

        FabricaAudi AudiA5 = new FabricaAudi("A5","Sedan","negru",2.0,dotariAudiA5);
        AudiA5.prezentareAudi();

        FabricaAudi AudiA7 = new FabricaAudi("A7","SUV","rosu",4.0,dotariAudiA7);
        AudiA7.prezentareAudi();

        // Legat de incapsulare : setModel = ca sa modificam valoarea , iar getModel doar ne afiseaza valoarea
//        AudiA7.setModel("A8");
//        AudiA7.prezentareAudi();

        AudiA7.angajariFirma();
        AudiA7.afisareRezultate();
        AudiA7.afisareRezultate(2016);
        AudiA7.afisareRezultate("X");


        FabricaBMW BMWX5 = new FabricaBMW("X5","SUV","albastru",3.0,dotariBMWX7exterior,dotariBMWX5interior);
        BMWX5.prezentareBMW();
        BMWX5.angajariFirma();
    }
}

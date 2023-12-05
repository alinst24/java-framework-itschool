package multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class multimi2 {
@Test



    public void metodaTest() {
    // afisam numele cursantilor
//numeCursanti_Array();
//numeCursanti_Lista();
//obiecteHashMap();
    //tariOrase();
    reteteGatit("Tiramisu");

}
        public void numeCursanti_Array () {
            // un array il recunoastem mereu dupa paranteze drepte
            String[] NumeCursanti = new String[4];     // 4 = cate elemente sa contina multimea
            NumeCursanti[0] = "Adi";
            NumeCursanti[1] = "Anca";
            NumeCursanti[2] = "Andreea";
            NumeCursanti[3] = "Claudia";
            for (Integer index = 0; index < NumeCursanti.length; index++) {       // ca multimea sa fie parcursa trebuie o conditie     (for sau while)
                System.out.println(NumeCursanti[index]);
            }
        }




        public void numeCursanti_Lista(){

            List<String> numeCursanti=new ArrayList<>();          // lista de stringuri    ; linia asta este acelasi lucru cu linia 22, diferenta dintre array si lista este ca la o lista nu trebuie sa mai specificam dimensiunea
            numeCursanti.add("Cosmin");
            numeCursanti.add("Diana");
            numeCursanti.add("Letitia");
            numeCursanti.add("Oana");
            for (Integer index = 0; index < numeCursanti.size(); index++) {
                System.out.println(numeCursanti.get(index));
            }
        }




// cheia = categoria , value = valoarea , folosim hashmap atunci cand avem elemente din diverse categorii
        // hashmap = key - value

// putem trata o multime de valori in mai multe feluri in java
//1. array
//2. lista
//3. hashmap
    public void obiecteHashMap(){

        HashMap<String , String> obiecte=new HashMap<>();     //hashmap de stringuri
        obiecte.put("electronic","telefon");
        obiecte.put("aliment","supa");
        obiecte.put("masina","Ford");
        for (String key: obiecte.keySet()){                  // pe baza cheii accesam valoarea    // asta este un for each !!!
            System.out.println("Cheia este " +key);                           // am facut 2 sout-uri ca sa ne afiseze si cheia si valoarea
            System.out.println("Valoarea este " +obiecte.get(key));
        }

//cand avem nevoie de hashmap :
        // daca avem un framework si in el avem 100 teste , in fiecare trebuie sa ne logam si facem sendkeys pe email si parola ; daca se strica spre ex : mail-ul trebuie sa modificam peste tot..
        // deci putem folosi asta la data driven testing: face un mecanism care sa incarce din exterior date pe care sa le folosim ca date de test;       in loc sa salvam in fiecare clasa emailul si parola, facem un notepad ,salvam datele si facem ca toate testele sa citeasca din fisierul extern ;
// si astfel modificam doar undeva , nu in toate 100
    }

    // intr-un hashmap nu putem avea chei duplicate, dar putem da mai multe valori , ex : mai jos
    //reprezentam niste tari cu orase
    public void tariOrase(){
    // pentru a da mai multe valori, putem folosi fie List fie Array.
    HashMap<String,List<String>> testData=new HashMap<>();    // o initializam

    List<String> oraseRomania=new ArrayList<>();
    oraseRomania.add("Bucuresti");
    oraseRomania.add("Timisoara");
    oraseRomania.add("Cluj-Napoca");


    List<String> oraseItalia=new ArrayList<>();
    oraseItalia.add("Roma");
    oraseItalia.add("Florenta");
    oraseItalia.add("Venetia");

    List<String> oraseSpania=new ArrayList<>();
    oraseSpania.add("Barcelona");
    oraseSpania.add("Madrid");
    oraseSpania.add("Sevilla");

    // asa adaugam un element intr-un hashmap , mai jos :

    testData.put("Romania",oraseRomania);    // si valoarea : este lista "oraseRomania"
    testData.put("Italia",oraseItalia);
    testData.put("Spania",oraseSpania);

        for (String key: testData.keySet()){
            System.out.println("Tara este " +key);
            System.out.println("Orasele sunt " +testData.get(key));


            // asta am facut-o ca sa ne arate multimea pe fiecare rand , nu pe acelasi rand.
            List<String>oraseleCurente = testData.get(key);
            for(Integer index=0;index<oraseleCurente.size();index++){
            System.out.println(oraseleCurente.get(index));
        }
        }

}



//definim retete de gatit

    public void reteteGatit(String reteta) {
        HashMap<String, List<String>> carteBucate = new HashMap<>();        // Ca sa ne prezinte in ordinea scrisa de noi , punem in loc de HashMap la final , LinkedHashMap   ; altfel , hashmap nu tine cont de ordine.

        List<String> ciorbaRadauteana = new ArrayList<>();
        ciorbaRadauteana.add("Morcovi - 2");
        ciorbaRadauteana.add("Ceapa - 3");
        ciorbaRadauteana.add("Telina - 1/2 bucati");
        ciorbaRadauteana.add("Galbenus de ou");
        ciorbaRadauteana.add("Apa - 4L");
        ciorbaRadauteana.add("Carne de pui - 500g");
        ciorbaRadauteana.add("Sare si piper - dupa gust");

        List<String> Tiramisu = new ArrayList<>();
        Tiramisu.add("Piscoturi - 400g");
        Tiramisu.add("Mascarpone - 500g");
        Tiramisu.add("Cafea - 50ml");
        Tiramisu.add("Amaretto - 20ml");
        Tiramisu.add("Oua - 3");
        Tiramisu.add("Zahar - 3 linguri");

        carteBucate.put("Ciorba Radauteana", ciorbaRadauteana);
        carteBucate.put("Tiramisu", Tiramisu);

        for (String key : carteBucate.keySet()) {
            if (key.equals(reteta)) {

                System.out.println("Reteta este pentru " + key);
                System.out.println("Ingredientele pentru reteta sunt urmatoarele: " + carteBucate.get(key));
            }
        }


        // Desi avem mai multe retete,  ca sa afisam numai o anumita reteta : ii punem un parametru la metoda :ex : String reteta si facem if-ul de mai sus cu equals ; iar apoi in metoda de test apelam metoda cu valoarea ceruta(ex: tiramisu).
    }
}










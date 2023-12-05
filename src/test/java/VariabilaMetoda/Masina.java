package VariabilaMetoda;

import org.testng.annotations.Test;

public class Masina {

public String model;
public String marca;
public Integer pret;
public String putere;

@Test
public void MetodaTest() {
    InfoMasina("Symbol","Renault",7800,"55CP");
    InfoMasina("Logan","Dacia",5600,"99CP");
    InfoMasina("Golf","Volkswagen",9000,"49CP");
    InfoMasina("A3","Audi",12499,"119CP");
    InfoMasina1("Spring","Dacia");

}

public void InfoMasina (String parametru1, String parametru2, Integer parametru3, String parametru4){
    model =parametru1;
    marca =parametru2;
    pret =parametru3;
    putere =parametru4;



    // "sout" =
    System.out.println("Modelul masinii este " + model);
    System.out.println("Marca masinii este " + marca);
    System.out.println("Pretul masinii este " + pret);
    System.out.println("Puterea masinii este " + putere);




}

    public void InfoMasina1 (String parametru1, String parametru2){
        model =parametru1;
        marca =parametru2;




        // "sout" =
        System.out.println("Modelul masinii este " + model);
        System.out.println("Marca masinii este " + marca);




    }
///////


    public class Masini {

        // Marca,model,an fabricatie,km,motor,combustibil,cai putere,culoare,stare,pret

        public String Marca;
        public String Model;
        public Integer AnFabricatie;
        public Integer Km;
        public Double Motor;
        public String Combustibil;
        public Integer CaiPutere;
        public String Culoare;
        public String Stare;
        public Integer Pret;

        @Test
        public void AtribuireValori() {
            Marca = "Seat";
            Model = "Leon";
            AnFabricatie = 2011;
            Km = 211568;
            Motor = 1.6;
            Combustibil = "Diesel";
            CaiPutere = 120;
            Culoare = "Negru";
            Stare = "Utilizat";
            Pret = 6000;

            System.out.println("Marca masinii este: " + Marca);
            System.out.println("Modelul masinii este: " + Model);
            System.out.println("Anul de fabricatie: " + AnFabricatie);
            System.out.println("Km: " + Km+" km");
            System.out.println("Motor: " + Motor+" TDI");
            System.out.println("Combustibil: " + Combustibil);
            System.out.println("CaiPutere: " + CaiPutere+" CP");
            System.out.println("Culoare: " + Culoare);
            System.out.println("Stare: " + Stare);
            System.out.println("Pret: " + Pret+" Euro");

        }
    }



    
    // metoda care calculeaza salariul unei persoane dupa o marire

    public Integer get_marire(Integer procent){
        Integer salariu=5000;
        Integer marire=(salariu*procent)/100;
        return salariu+marire;

    }


    public Double get_medie(Double n1, Double n2){
        return (n1+n2)/2;
    }

    public void calculMedie(Double nr1, Double nr2, String text){
        System.out.println("Media pe "+text+" este "+get_medie(nr1,nr2));
    }







}

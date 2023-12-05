package Obiect;

public class FabricaMasini {

    // conceptul de obiect si constructor:

    // Constructor = are ca rol sa initializeze atributele unei clase
    // Un constructor este public si are acelasi nume cu clasa
    // Un constructor poate sa fie de 2 feluri : cu parametrii si fara parametrii
    //Un constructor fara parametrii se mai numeste si "default"
    //Daca nu am definit noi un constructor, exista unul default.
    // Intr-o clasa putem avea "n" constructori, diferentiati prin numar sau tip de parametrii.

    //Obiect = instanta unei clase
    // Adica un obiect reprezinta o structura pe care o are clasa si din care poate accesa variabilele si metodele respective.

    //Dintr-o clasa putem initializa "n" obiecte
    // In momentul in care initializam un obiect , apelam constructorul din clasa.
    // obiectele se diferentiaza dupa nume.




    // Intr-un constructor , valorile din clasa au acelasi nume cu parametrii de la metoda - si folosim ".this" ca sa pointeze spre variabila din clasa
    public String marca;
    public String model;
    public String combustibil;
    public String transmisie;
    public Integer an;
    public Double motorizare;
    public Integer pret;


//    public FabricaMasini(String marca, String model, String combustibil, String transmisie, Integer an, Double motorizare){
//        this.marca=marca;
//        //
//        this.model=model;
//        this.mombustibil=combustibil;
//        this.mransmisie=transmisie;
//        this.mn=an;
//        this.motorizare=motorizare
//    }

    // acelasi lucru de sus il putem face cu click dreapta>generate>constructor si alegem apoi ce elemente ne dorim




    //
    public FabricaMasini(String marca, String model, String combustibil, String transmisie, Integer an, Double motorizare) {
        this.marca = marca;
        this.model = model;
        this.combustibil = combustibil;
        this.transmisie = transmisie;
        this.an = an;
        this.motorizare = motorizare;
    }


    public FabricaMasini(String marca, String model, String combustibil, String transmisie, Integer an, Double motorizare, Integer pret) {
        this.marca = marca;
        this.model = model;
        this.combustibil = combustibil;
        this.transmisie = transmisie;
        this.an = an;
        this.motorizare = motorizare;
        this.pret = pret;
    }



    // proprietati pe care le apelam in alta clasa:
    public void prezentareProdus(){
        System.out.println("Marca masinii este "+marca);
        System.out.println("Modelul masinii este "+model);
        System.out.println("Tipul de combustibil folosit este : "+combustibil);
        System.out.println("Transmisia este :"+transmisie);
        System.out.println("Anul fabricatiei este: "+an);
        System.out.println("Motorizarea masinii este: "+motorizare);
        // pentru alea care nu afisam pretul :
        if (pret != null) {                // != este "diferit"
            System.out.println("Pretul masinii este: " + pret);
        }
    }
    // Si facem o alta clasa in care chemam clasa aceasta.(rezultatul in alta) = in ObiectTest






    public void calculImpozit(){
        if (an >= 2020 && combustibil.equals("Electric")){
            System.out.println("Clientul trebuie sa plateasca 5 lei.");
        }
        else {
            System.out.println("Clientul trebuie sa plateasca in functie de anul masinii.");
        }
    }





}

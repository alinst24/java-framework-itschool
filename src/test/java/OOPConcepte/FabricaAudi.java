package OOPConcepte;


import java.util.List;

public class FabricaAudi extends FabricaMasina {               // "extends" face mostenirea (fabricamasina e parintele)

    // Putem sa adaugam niste proprietati pe care sa nu le mosteneasca din clasa parinte , ci specifice doar pentru copil :
    private Integer pretStandard;
    private Integer pretFinal;

    private List<String> dotariExterioare;

    public FabricaAudi (String model, String sasiu, String culoare, Double motorizare,List<String> dotariExterioare) {           // Iar aici introducem variabilele pe care le-am introdus mai sus
        super("Audi", model, sasiu, culoare, motorizare);                          // super , pointeaza pe faptul ca se va apela constructorul din clasa parinte   (aici nu se modifica) ; ca sa fie mereu aceeasi valoare:ex: scriem "Audi"
        this.dotariExterioare=dotariExterioare;
    }

    public void prezentareAudi(){
        prezentareMasina();
        definirePretModel();
        calculPretFinal();
        if (dotariExterioare==null){
            System.out.println("Pretul standard este "+pretStandard);
        }
        else {
            System.out.println("Pretul standard este "+pretStandard);
            System.out.println("Pretul final este "+pretFinal);
        }

        // pe langa cele afisate de"prezentareMasina",definire,calcul etec.. mai sus , mai putem adauga afisari specifice pt copil:
        System.out.println("Dotarile exterioare sunt "+dotariExterioare);
    }

    public void definirePretModel(){

        switch (getModel()){        // getModel : acceseaza valoarea                             // in functie de model, alege:
            case "A5":
                pretStandard=40000;
                break;
            case "A7":
                pretStandard=80000;
                break;
            default:               //spre ex: daca vine un client si comanda un A2,care nu mai exista, folosim:  o valoare default
                System.out.println("Nu mai avem stock la acest model.");
        }
    }

    public void calculPretFinal(){
        Integer pretDotari = 0;
        for(Integer index=0;index<dotariExterioare.size();index++){
            switch (dotariExterioare.get(index)){
                case "Jenti":
                    pretDotari= pretDotari+500;
                    break;
                case "Trapa":
                    pretDotari=pretDotari+900;
                    break;
                case "Spoiler":
                    pretDotari=pretDotari+650;
                    break;
                case "Oglinzi electrice":
                    pretDotari=pretDotari+2000;
                    break;

            }
        }
        pretFinal=pretStandard+pretDotari;
    }

    // Incapsulare :

    public Integer getPretStandard() {
        return pretStandard;
    }

    public Integer getPretFinal() {
        return pretFinal;
    }

    public List<String> getDotariExterioare() {
        return dotariExterioare;
    }

    public void setDotariExterioare(List<String> dotariExterioare) {
        this.dotariExterioare = dotariExterioare;
    }

    // Suprascriem metoda angajari din parinte - propria implementare a fabricii cu acelasi nume         (polimorfism dinamic)

    public void angajariFirma(){
        System.out.println("Fabrica Audi are 4 locuri disponibile.");
    }

    // Polimorfismul static :     cele de mai jos se diferentiaza dupa numar(de parametrii) sau tip

    public void afisareRezultate(){
        System.out.println("Fabrica a facut 15 masini.");
    }

    public void afisareRezultate(String marca){
        System.out.println("Fabrica a facut 10 masini cu marca X.");
    }

    public void afisareRezultate(String marca,Integer an){
        System.out.println("Fabrica a facut 10 masini cu marca X din anul 2022.");
    }

    public void afisareRezultate(Integer an){
        System.out.println("Fabrica a facut 10 masini din anul 2022.");
    }
}

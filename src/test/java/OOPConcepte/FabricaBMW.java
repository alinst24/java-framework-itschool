package OOPConcepte;

import java.util.List;

public class FabricaBMW extends FabricaMasina {               // "extends" face mostenirea (fabricamasina e parintele)

    // Putem sa adaugam niste proprietati pe care sa nu le mosteneasca din clasa parinte , ci specifice doar pentru copil :
    private Integer pretStandard;
    private Integer pretFinal;

    private List<String> dotariExterioare;
    private List<String> dotariInterioare;

    public FabricaBMW (String model, String sasiu, String culoare, Double motorizare,List<String> dotariExterioare,List<String> dotariInterioare) {           // Iar aici introducem variabilele pe care le-am introdus mai sus
        super("BMW", model, sasiu, culoare, motorizare);                          // super , pointeaza pe faptul ca se va apela constructorul din clasa parinte   (aici nu se modifica) ; ca sa fie mereu aceeasi valoare:ex: scriem "Audi"
        this.dotariExterioare=dotariExterioare;
        this.dotariInterioare=dotariInterioare;
    }

    public void prezentareBMW(){
        prezentareMasina();
        definirePretModel();
        pretFinal=pretStandard+calculDotariInterioare()+calculDotariExterioare();

        System.out.println("Pretul standard este "+pretStandard);
        System.out.println("Pretul final este "+pretFinal);

    }

    public void definirePretModel(){

        switch (getModel()){        // in functie de model, alege:
            case "X5":
                pretStandard=75000;
                break;
            case "X7":
                pretStandard=120000;
                break;
            default:               //spre ex: daca vine un client si comanda un A2,care nu mai exista, folosim:  o valoare default
                System.out.println("Nu mai avem stock la acest model.");
        }
    }

    public Integer calculDotariExterioare(){
        Integer pretDotari = 0;
        for(Integer index=0;index<dotariExterioare.size();index++) {
            switch (dotariExterioare.get(index)) {
                case "Jenti":
                    pretDotari = pretDotari + 500;
                    break;
                case "Trapa":
                    pretDotari = pretDotari + 900;
                    break;
                case "Faruri":
                    pretDotari = pretDotari + 1200;
                case "Spoiler":
                    pretDotari = pretDotari + 650;
                    break;
                case "Oglinzi electrice":
                    pretDotari = pretDotari + 2000;
                    break;

            }
        }
        return pretDotari;
    }
    public Integer calculDotariInterioare(){
        Integer pretDotari = 0;
        for(Integer index=0;index<dotariInterioare.size();index++){
            switch (dotariInterioare.get(index)){
                case "Incalzire scaune":
                    pretDotari= pretDotari+500;
                    break;
                case "Clima bizonica":
                    pretDotari=pretDotari+900;
                    break;
                case "GPS":
                    pretDotari=pretDotari+1200;
                    break;
                case"Tetiera cu masaj":
                    pretDotari=pretDotari+650;
                    break;
                case "Display parbriz":
                    pretDotari=pretDotari+2000;
                    break;

            }
        }
        return pretDotari;
    }

    public Integer getPretStandard() {
        return pretStandard;
    }

    public Integer getPretFinal() {
        return pretFinal;
    }

    public List<String> getDotariExterioare() {
        return dotariExterioare;
    }

    public List<String> getDotariInterioare() {
        return dotariInterioare;
    }


    // Am facut getter la toate pentru ca vrem sa le afiseze pe toate , si setter doar la ultimele 2 pentru ca doar pe acelea vrem sa le modificam

    public void setDotariExterioare(List<String> dotariExterioare) {
        this.dotariExterioare = dotariExterioare;
    }

    public void setDotariInterioare(List<String> dotariInterioare) {
        this.dotariInterioare = dotariInterioare;
    }


    // Polimorfism dinamic :
    public void angajariFirma(){
        System.out.println("Fabrica BMW nu are posturi pentru angajare");

        //Daca spre ex: am dori sa afiseze mesajul si din copil si din parinte , folosim super , care pointeaza catre clasa parinte
        super.angajariFirma();
    }
}

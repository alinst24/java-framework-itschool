package OOPConcepte;

public class FabricaMasina {

    // OOP = programare orientata pe obiect
    // Exista 4 principii : mostenire ,incapsulare , abstractizare , polimorfism
    // mostenire = conceptul prin care clasa parinte este mostenita de clasa copil
    // in Java , o clasa poate sa mosteneasca doar 1 singura clasa , (ex: A mosteneste pe B , si daca vrem si pe C trebuie sa facem o inlantuire : A pe B , B pe C)
    // o clasa cand mosteneste alta clasa are vizibilitate atat la metodele cat si la variabilele din clasa parinte
    // clasa copil trebuie sa apeleze constructorul din clasa parinte
    // copilul are vizibilitate asupra metodelor / variabilelor din parinte daca sunt publice/protected
    // ca sa apelam constructorul parinte in clasa copil folosim "super"

    // Access control : public , private ,protected, default(la acesta nu scriem nimic in fata functiei)
    // public = ofera vizibilitate pentru oricine si oriunde (in tot proiectul)
    // private = ofera vizibilitate doar in interiorul clasei


    // Incapsulare = procesul prin care anumite informatii le tinem departe de lumea exterioara(adica sa nu poata fii modificate : ex : marca , la o fabrica de masini )

    private String marca;
    private String model;
    private String sasiu;
    private String culoare;
    private Double motorizare;

    public FabricaMasina(String marca, String model, String sasiu, String culoare, Double motorizare) {
        this.marca = marca;                 // this. pointeaza catre variabilele de sus daca au acelasi nume
        this.model = model;
        this.sasiu = sasiu;
        this.culoare = culoare;
        this.motorizare = motorizare;
    }
    public void prezentareMasina(){

        System.out.println("Marca masinii este "+marca);
        System.out.println("Modelul masinii este "+model);
        System.out.println("Sasiul masinii este "+sasiu);
        System.out.println("Culoarea masiniii este "+culoare);
        System.out.println("Motorizarea masinii este "+motorizare);


    }
        // Polimorfism = conceptul prin care o metoda poate suferi modificari la nivel de continut sau structura
    // Polimorfismul este de 2 feluri : dinamic (override) si static (overload)
    // Polimorfismul dinamic = intr-o ierarhie de clase extinse prin mostenire , o metoda poate avea implementari diferite
    // Polimorfismul static = mai multe metode pot avea acelasi nume , cu conditia sa se diferentieze prin numar(de parametrii) sau tip de parametri          // se apeleaza aceeasi metoda ca denumire , dar valoarea este diferita(prin numar sau tipul de parametrii)
    // !!! Nu se poate aplica polimorfismul la metodele cu return, ci la cele cu void !


    // Polimorfism dinamic :
//  dinamic = suprascriere ; deci in clasele copil putem suprascrie o metoda cu acelasi nume din clasa parinte , avand alta valoare
    public void angajariFirma(){
        System.out.println("Fabrica mama nu mai face angajari.");

    }



    // Incapsularea :
    // Ca sa accesam valoarea unei variabile cu private ne folosim de conceptul "GET"
    // Ca sa modificam valoarea unei variabile private cu private ne folosim de conceptul "SET"
    // ex : in automation aplicam acest concept la locateri si la clasa parinte(sharedata)   ; EX: daca locaterii nu sunt incapsulati in clasa lor (si metodele sa le acceseze) putem strica codul : ex : "homePage.forms = null; sau driver=null;


    // Noi vrem ca "clientul" sa poata modifica pe toate de sus, fara marca. Deci toate vor avea get si set, iar doar marca va avea doar get.


    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSasiu() {
        return sasiu;
    }

    public void setSasiu(String sasiu) {
        this.sasiu = sasiu;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public Double getMotorizare() {
        return motorizare;
    }

    public void setMotorizare(Double motorizare) {
        this.motorizare = motorizare;
    }
}

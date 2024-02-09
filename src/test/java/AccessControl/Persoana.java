package AccessControl;

public class Persoana {

    // Access control in java sunt de 3 tipuri : public, private, protected
    // Se pot folosi la variabile sau metode
    // Public = ofera vizibilitate peste tot si oricui in intregul program
    // Parinte Copil= vizibil peste tot
    // Obiect = vizibil in acelasi pachet + in orice pachet

    // Private = ofera vizibilitate doar in interiorul clasei respective
    // Parinte Copil = nu este vizibil chiar daca ne aflam in acelasi pachet sau nu
    // Obiect = nu este vizibil in nici-un pachet

    // Protected = ofera vizibilitate peste tot in interiorul pachetului
    // Parinte Copil = ofera vizibilitate peste tot si oricui in intregul program
    // Obiect = este vizibil daca este in acelasi pachet / nu este vizibil daca este in afara pachetului

    public void metodaPublica(){       // 3 metode cu tipuri diferite de acces control


    }

    private void metodaPrivata(){


    }

    protected void metodaProtected(){


    }
}

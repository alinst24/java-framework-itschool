package StaticKeyword;

public class Elev {

    // static = este un keyword care are ca scop sa pastreze valoarea unei informatii pentru toate instantele unei clase . EX :daca facem 100 elevi, toti vor avea aceeasi informatie legata de scoala
    // adica ex : sa se stie din start ca sunt la o anumita scoala (EX: Dimitrie Cantemir)

    // static se poate aplica la variabile si metode

    private String numeElev;

    private String prenumeElev;

    private static String scoala = "Dimitrie Cantemir";       // astfel , o valoare pe care o vom da la "scoala" se va pastra pentru toate instantele acestei clase

    private static Integer nrElevi=0;      // facem o variabila statica care sa ne defineasca cati elevi avem ; deci putem afla o suma dupa acest static

    public Elev(String numeElev, String prenumeElev) {
        this.numeElev = numeElev;
        this.prenumeElev = prenumeElev;
        nrElevi++;                             //si pe masura ce se initializeaza obiecte(adica se inscriu elevi la scoala) , sa creasca cu+1
    }

    public void prezentareElev(){
        System.out.println("Numele elevului este " +numeElev);
        System.out.println("Prenumele elevului este " +prenumeElev);
        System.out.println("Scoala elevului este " +scoala);
        System.out.println("Nr de elevi inscrisi la scoala sunt:" +nrElevi);
    }
}

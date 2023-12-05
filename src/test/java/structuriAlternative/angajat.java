package structuriAlternative;

import org.testng.annotations.Test;

public class angajat {
    @Test
    public void metodaTest(){
zileleSaptamanii(3);
// aici alegem cazul pe care il dorim sa il afiseze



// switch case-urile le folosim cand vrem sa optimizam putin codul ( ca sa nu scriem foarte multe if-uri , pentru ca se consuma multe resurse si timp)
        // switch-ul evalueaza o valoare      ; if are conditii , si le parcurge pe toate , pe cand switch case-urile sunt mai rapide, merg tintite
        // switch-case-urile se pot folosi pe site-uri cu meniuri si sub-meniuri
    }
    // reprezentam zilele saptamanii
    public void zileleSaptamanii(Integer zi){
        switch (zi){
            case 1:
                System.out.println("Astazi este duminica.");
                break;
                // folosim break ca sa se opreasca dupa valoarea data
            case 2:
                System.out.println("Astazi este luni.");
                break;
            case 3:
                System.out.println("Astazi este marti.");
                break;
            case 4:
                System.out.println("Astazi este miercuri.");
                break;
            case 5:
                System.out.println("Astazi este joi.");
                break;
            case 6:
                System.out.println("Astazi este vineri.");
                break;
            case 7:
                System.out.println("Astazi este sambata.");
                break;
        }
    }


}

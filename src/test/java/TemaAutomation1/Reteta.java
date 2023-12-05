package TemaAutomation1;

import org.testng.annotations.Test;

public class Reteta {
    // Clatite americane: faina,lapte,oua,praf de copt, bicarbonat, sare, zahar, zahar vanilat, ulei

    public String Reteta;
    public Integer Faina;
    public Integer Lapte;
    public Integer Oua;
    public Integer PrafDeCopt;
    public String Bicarbonat;
    public String Sare;
    public Integer Zahar;
    public Boolean ZaharVanilat;
    public Integer Ulei;

    @Test
    public void AtribuireValori() {
        Reteta = "Clatite Americane";
        Faina = 400;
        Lapte = 500;
        Oua = 4;
        PrafDeCopt = 3;
        Bicarbonat = "1/2";
        Sare = "un varf de sare";
        Zahar = 5;
        ZaharVanilat = true;
        Ulei = 6;

        System.out.println(Reteta);
        System.out.println("Faina: " + Faina + " grame.");
        System.out.println("Lapte: " + Lapte + " ml.");
        System.out.println("Oua: " + Oua);
        System.out.println("Praf de copt: " + PrafDeCopt + " lingurite.");
        System.out.println("Bicarbonat: " + Bicarbonat + " de lingurita");
        System.out.println("Sare: " + Sare);
        System.out.println("Zahar: " + Zahar + " grame.");
        System.out.println("ZaharVanilat: " + ZaharVanilat);
        System.out.println("Ulei: " + Ulei + " lingurite.");

    }
}

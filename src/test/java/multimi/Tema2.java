package multimi;

import org.testng.annotations.Test;

public class Tema2 {


    @Test
    public void metodaTestTema(){

//cerinta1(1,2,2);
//cerinta1(1,2,7);


        //cerinta2();
       // cerinta3();
//cerinta4();
        //cerinta5();
        //cerinta6();
        //cerinta7();
cerinta8();
    }


// Cerinta 1.            b
    public void cerinta1(Integer nr1, Integer nr2, Integer nr3){
        Integer suma_toate= nr1+nr2+nr3;
        Integer suma_primele2= nr1+nr2;
        if (suma_primele2>nr3){
            System.out.println("Suma primelor 2 numere: "+suma_primele2+" este mai mare decat al treilea numar.");
        }
        else {
            System.out.println("Suma primelor 2 numere: "+suma_primele2+" nu este mai mare decat al treilea numar.");
        }

    }






    // cerinta 2.
    public void cerinta2(){
        String mesaj="DA ";
        for (Integer index=0;index<5;index++){
            System.out.print(mesaj);
        }
    }






    //cerinta 3.
    public void cerinta3(){
        Integer index=0;
        String mesaj="DA ";
        while(index<5){
            index++;
            System.out.print(mesaj);
        }

    }

//Cerinta 4.

    public void cerinta4(){
        Integer contor=0;
        for (Integer index=0;index<100;index++){
            if (index%3==0 && contor<5){
                contor++;
                System.out.println(index);
            }
        }
    }

//Cerinta 5.
    public void cerinta5(){
        Integer contor=0;
        for(Integer index=0;index<100;index++){
            if(index%5==0 && contor<3){
                contor++;
                System.out.println(index);
            }
        }
    }


    //cerinta 6.

    public void cerinta6(){
        Integer contor=0;
        for (Integer index=0;index<100;index++){
            if (index>-1 && index%2==0 && contor<4){
                contor++;
                System.out.println(index);
            }
        }
    }



    // cerinta 7.
    public void cerinta7() {
        Integer index = 0;
        Integer suma = index;
        while (index <= 10) {
            suma = suma + index;
            index++;
        }
        System.out.println("Suma numerelor pana la 10 este " + suma + ".");
    }



    // cerinta 8.
    public void cerinta8() {
        Integer index = 1;
        Integer produs = index;
        while (index <= 5) {
            produs = produs * index;
            index++;
        }
        System.out.println("Produsul primelor 5 numere este " + produs + ".");
    }

}

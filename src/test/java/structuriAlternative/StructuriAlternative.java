package structuriAlternative;

import org.testng.annotations.Test;

public class StructuriAlternative {

    // Structurile alternative definesc niste conditii
    // IF = structura de control care este folosita pentru a evalua o conditie booleana  si pentru a executa un anumit
    // bloc de cod, daca aceasta conditie este adevarata
    // if(conditia){
    // bloc de cod care se executa daca conditia este adevarata
    // } else{
    // bloc de cod care va fi executat daca conditia este falsa
    // }

    @Test
    public void metodaDeTest() {
//        verificareNumar(-1);
//        verificareNumar(6);
//        verificareNumar(0);
//        verificareNumar(7);
//        verificareNumar(62);
//        verificareNumar(-553);
        afisareZileSaptamana(4);
        afisareZileSaptamana(3);
        afisareZileSaptamana(6);
        afisareZileSaptamana(8);
    }

    public void verificareNumar(int numar) {
        if (numar > 0) {
            if (numar % 2 == 0) {
                System.out.println("Numarul: " + numar + " este par si pozitiv");
            } else {
                System.out.println("Numarul: " + numar + " este impar si pozitiv");
            }
        } else if (numar < 0) {
            if (numar % 2 == 0) {
                System.out.println("Numarul: " + numar + " este par si negativ");
            } else {
                System.out.println("Numarul: " + numar + " este impar si negativ");
            }
        } else {
            System.out.println("Numarul este egal cu 0");
        }
    }

    //Switch este o structura de control care permite evaluarea si executarea unuia dintre mai multe blocuri de cod
    //in funcite de valoarea expresiei evaluate.
    //Structura: switch(expresia de evaluat){
    //      case valoare1:
    //              bloc de cod care se executa in cazul in care expresia are valoarea1
    //              break;
    //      case valoare2:
    //              bloc de cod care se executa in cazul in care expresia are valoarea2
    //              break;
    //      default:
    //              bloc de cod care se executa in cazul in care niciunul dintre cazurile de mai sus nu se potriveste
    //              break;

    public void afisareZileSaptamana(int zi){
        switch (zi){
            case    1:
                System.out.println("Astazi este ziua de Luni");
                break;
            case    2:
                System.out.println("Astazi este ziua de Marti");
                break;
            case    3:
                System.out.println("Astazi este ziua de Miercuri");
                break;
            case    4:
                System.out.println("Astazi este ziua de Joi");
                break;
            case    5:
                System.out.println("Astazi este ziua de Vineri");
                break;
            case    6:
                System.out.println("Astazi este ziua de Sambata");
                break;
            case    7:
                System.out.println("Astazi este ziua de Duminica");
                break;
            default:
                System.out.println(zi+" Asta nu este o zi a saptamanii");
        }
    }

}

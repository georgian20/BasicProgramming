package teme;

import org.testng.annotations.Test;

public class TemaVariabiaSiMetoda {

    // Detalii despre o casa
    // minimum 3 variabile globale - bifat
    // minimum 3 variabile locale in oricare metoda - bifat
    // doua metode cu void - o metoda cu parametru, una fara parametru
    // doua metode cu return - una cu parametru, una fara parametru
    // o metoda de test - sa afisam (sout) toate variabilele si metodele lucrate

    //Variabile globale

    double suprafataCasa=74.33;
    int numarCamere=6;
    String amplasament="Bucuresti S6";
    int anConstructie=2020;

    @Test
    public void afisareDetalii(){
        System.out.println("Anul de constructie al casei este: "+anConstructie);
        System.out.println("Numarul total de camere este: "+numarCamere+" camere");
        System.out.println("Suprafata utila este de: "+suprafataCasa+"mp, iar amplasamentul acesteia este "+amplasament);
    }

    @Test
    public void detaliiCameraUnu() {
        String culoarePereti = "albastra"; //variabila locala
        int nrFerestre = 2; //variabila locala
        char initialaCamera = 'F'; //variabila locala
        System.out.println("Casa construita in anul " + anConstructie + " are mai multe camere. Peretii primei camere au culoarea " + culoarePereti);
        //variabila globala + variabila locala
        System.out.println("Initiala de pe usa primei camere este: " + initialaCamera);
        //sout doar pentru variabila locala
    }

    @Test
    public void modificareNumarCamere (int nrCamActual){
        //metoda void cu parametru
        int nrCamVechi=numarCamere;
        numarCamere=nrCamActual;
        System.out.println("Casa initial a avut "+nrCamVechi+" camere, iar in prezent are "+nrCamActual+" camere");
    }

    public double pretLocuinta(){
        //metoda return fara parametru
        return suprafataCasa*1200;  //Suprafata casei inmultita cu pretul/mp
    }

    public boolean suprafataSuficienta(double surface){
        //metoda return cu parametru
        return suprafataCasa>=surface;
    }

    @Test
    public void detaliiCasa(){
        //afisarea tuturor metodelor si variabilelor lucrate
        afisareDetalii();
        modificareNumarCamere(8);
        double pret=pretLocuinta();
        System.out.println("Pretul locuintei este de: "+pret+" EUR");
        boolean spatiuSuficient=suprafataSuficienta(65.5);
        System.out.println("Locuinta are suprafata utila suficienta? "+spatiuSuficient);
    }


}

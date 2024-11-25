package variabileSiMetode;
import org.testng.annotations. Test;

public class Persoana {

    String nume="Popescu";
    String prenume="Ion";
    char sexul='M';
    int anulNasterii=2004;

    @Test
    public void afisarePersoana(){
        System.out.println("Numele persoanei este: "+nume);
        System.out.println("Prenuleme persoanei este: "+prenume);
        System.out.println("Anul nasterii persoanei este: "+anulNasterii+" Sexul este: "+sexul);
    }

    @Test
    public void afisareDetaliiPersoana(){
        double inaltime=1.80;
        int greutate=80;
        System.out.println("Persoana are inaltimea de: "+inaltime);
        System.out.println("Greutatea persoanei este: "+greutate);
        System.out.println("Numele persoanei este: "+nume+" Inaltimea este de: "+inaltime);
    }

    // O metoda este un bloc de cod care indeplineste o functie specifica
    // Metodele sunt de doua tipuri: void sau return
    // Void - nu returneaza nimic
    // Return - returneaza un tip de date: string, boolean, int
    // in loc de public void va fi public int sau string iar la sfarsit, ineinte de ultima acolada
    // trebuie sa fie un return, iar acestea trebuie sa returneze aceeasi valorare declarata la string

    public int calculVarsta(){
        return 2024-anulNasterii;
    }

    public boolean esteAdult(int varsta){
        return varsta>18;
    }

    @Test
    public void afisareDatePersoana(){
        int varstaReala=calculVarsta();
        System.out.println("Varsta calculata a persoanei este: "+calculVarsta()+" ani");
        System.out.println("Persoana este adult? "+esteAdult(varstaReala));
    }
}

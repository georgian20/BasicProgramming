package obiectConstructor;

public class Avion {

    //Constructorul are rolul sa initializeze variabilele unei clase
    //Recunoastem un constructor dupa numele clasei - este o metoda speciala care nu are void sau return
    //Intr-o clasa putem sa avem unul sau mai multi constructori care se diferentiaza dupa numarul sau tipul de parametrii
    //Intr-o clasa exista intotdeauna un constructor default (fara parametrii)
    //Constructorii sunt cu sau fara parametrii
    //Constructorul trebuie sa fie intotdeauna public

    //Un obiect in java este o instanta a unei clase
    //Ca sa initializam un obiect folosim cuvantul "new"
    //Cand se initializeaza un obiect se apeleaza constructorul clasei

    public String tip;
    public String marca;
    public int capacitatePasageri;
    public int anulFabricatiei;
    public Integer capacitateBagaje;
    public String modelAvion;

    public Avion(String tip, String marca, int capacitatePasageri, int anulFabricatiei, Integer capacitateBagaje, String modelAvion){
        this.tip = tip;
        this.capacitatePasageri = capacitatePasageri;
        this.anulFabricatiei = anulFabricatiei;
        this.capacitateBagaje = capacitateBagaje;
        this.modelAvion = modelAvion;
        this.marca = marca;
    }

    public void prezentareAvion(){
        System.out.println("Tipul avionului este: "+tip);
        System.out.println("Marca avionului este: "+marca);
        System.out.println("Capacitatea maxima de pasageri este: "+capacitatePasageri);
        System.out.println("Anul fabricatiei este: "+anulFabricatiei);
        System.out.println("Capacitatea maxima pentru bagahe este: "+capacitateBagaje);
        System.out.println("Modelul de avion este: "+modelAvion);
        if(capacitateBagaje != null){
            System.out.println("Capacitatea maxima pentru bagahe este: "+capacitateBagaje);
        } else {
            System.out.println("Avionul nu are bagaje");
        }
    }

    public Avion(String tip, String marca, int capacitatePasageri, int anulFabricatiei, String modelAvion){
        this.tip = tip;
        this.capacitatePasageri = capacitatePasageri;
        this.anulFabricatiei = anulFabricatiei;
        this.modelAvion = modelAvion;
        this.marca = marca;
    }
}

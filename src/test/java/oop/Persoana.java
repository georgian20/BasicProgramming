package oop;

public class Persoana {

    //OOP = programare orientata pe obiect (object oriented programming)
    //4 principii importante: mostenire; incapsulare; polimorfism; abstractizare
    //Mostenire i java este conceptul prin care o clasa (clasa copil) mosteneste o alta clasa (clasa parinte)
    //In java se poate mosteni o singura clasa
    //In momentul in care o clasa mosteneste o alta clasa, clasa copil va trebui sa apeleze constructorul din parinte
    //In momentul in care se aplica mostenirea, clasa copil are vizibilitate asupra variabilelor / metodelor din clasa parinte
    //Constructorul din clasa parinte spre copil se apeleaza cu "super"
    //In java ca sa extinzi o alta clasa se foloseste cuvantul "extend"
    //
    //Incapsulare - proces prin care tinem private anumite informatii, in asa fel incat ele sa nu poata fi modificate
    //facem variabilele / metodele din public in private
    //private = acces control care restrictioneaza accesul doar in clasa respectiva. inseamna ca pot fi accesate doar
    // in clasa in care au fost create
    //ca sa putem extrage sau modifica o valoare a unei variabile private ne folosim de metode get si set
    //
    //Polimorfismul permite utilizarea unui singur nume din metoda pentru a reprezenta metode diferite, car sunt selectate in mod dinamic in functie de contextul de executie
    //Polimorfismul este de doua tipuri: compilare (overloading = static; poate sa aiba return, tip de parametrii diferiti, nr de parametrii diferiti) si executie (overriding = dinamic; implementeaza o metoda cu o logica diferita)
    //
    //Conceptul prin care definim mai multe implementari pentru o metoda
    //Polimorfism dinamic = intr-o ierarhie de clase obtinute prin mostenire, o metoda poate avea implementari diferite;
    //Daca vrem sa chemam in copil metoda din parinte, trebuie sa utilizam keyword-ul 'super'
    //
    //Polimorfism static = posibilitatea prin care o metoda are mai multe implementari prin diferentierea tipului sau a numarului de parametrii;
    //
    //Abstractizarea presupune expunerea doar a aspectelor esentiale ale unui obiect, ascuzand detaliile implementarii
    //Acest lucru se realizeaza prin folosirea claselor abstracte sau a interfectelor
    //
    //


    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana(){
        System.out.println("Numele persoanei este: "+nume);
        System.out.println("Prenumele persoanei este: "+prenume);
        System.out.println("Varsta persoanei este: "+varsta);
    }

    //Polimorfism dinamic exemplu: prima implementare a metodei;
    public void mananca (){
        System.out.println("Persoana mananca atunci cand ii este foame");
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}

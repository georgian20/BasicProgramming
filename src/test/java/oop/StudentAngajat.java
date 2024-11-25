package oop;

public class StudentAngajat extends Persoana implements StudentInterface,AngajatInterface{

    private String facultate;
    private boolean bursa;
    private String cursuri;
    private String companie;
    private String profesie;
    private int vechime;

    public StudentAngajat(String nume, String prenume, int varsta, String facultate, boolean bursa, String cursuri, String companie, String profesie, int vechime) {
        super(nume, prenume, varsta);
        this.facultate = facultate;
        this.bursa = bursa;
        this.cursuri = cursuri;
        this.companie = companie;
        this.profesie = profesie;
        this.vechime = vechime;
    }

    @Override
    public void mergeLaMunca() {
        System.out.println("Dupa curs merge la munca");
    }

    @Override
    public void munceste() {
        System.out.println("Acesta munceste 8 ore");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Studentul primeste salariul o data la 2 saptamani");
    }

    @Override
    public void isiDaDemisia() {
        System.out.println("Cand vine vacanta isi da demisia");
    }

    @Override
    public void mergeLaCursuri() {
        System.out.println("Cand nu merge la munca, acesta merge la cursuri");
    }

    @Override
    public void sustineExamen() {
        System.out.println("Sustine examene");
    }

    @Override
    public void mergeLaPetreceri() {
        System.out.println("Merge mai rar la petreceri, nu mai are asa mult timp");
    }
}

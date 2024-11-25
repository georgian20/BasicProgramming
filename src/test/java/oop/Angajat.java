package oop;

public class Angajat extends Persoana implements AngajatInterface{

    private String companie;
    private String profesie;
    private int vechime;

    public Angajat(String nume, String prenume, int varsta, String companie, String profesie, int vechime) {
        super(nume, prenume, varsta);
        this.companie = companie;
        this.profesie = profesie;
        this.vechime = vechime;
    }

    public void infoAngajat(){
        infoPersoana();
        System.out.println("Angajatul: "+getNume()+" lucreaza la compania: "+companie);
        System.out.println("Angajatul: "+getPrenume()+" are profesia de: "+profesie);
        System.out.println("Angajatul: "+getNume()+" are "+vechime+" ani vechime");
    }

    public void mananca(){
        System.out.println("Angajatul mananca in timpul pauzei de masa");
        super.mananca();
    }

    public void programLucru(){
        System.out.println("Angajatul lucreaza 8h standard");
    }

    public void programLucru(int numarOre){
        System.out.println("Angajatul part-time lucreaza: "+numarOre+" ore");
    }

    public void progamLucru(String locatie){
        System.out.println("Tester-ul lucreaza: "+locatie);
    }

    public void programLucru(boolean lucreazaInWeekend){
        System.out.println("Angajatul sarguincios lucreaza in weekend? "+lucreazaInWeekend);
    }

    public String getCompanie() {
        return companie;
    }

    public void setCompanie(String companie) {
        this.companie = companie;
    }

    public String getProfesie() {
        return profesie;
    }

    public void setProfesie(String profesie) {
        this.profesie = profesie;
    }

    public int getVechime() {
        return vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    @Override
    public void mergeLaMunca() {
        System.out.println("Angajatul merge la munca");
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul se preface ca munceste");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Angajatul primeste salariul lunar");
    }

    @Override
    public void isiDaDemisia() {
        System.out.println("Angajatul s-a saturat si isi da demisia");
    }
}

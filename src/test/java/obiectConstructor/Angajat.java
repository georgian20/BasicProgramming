package obiectConstructor;

public class Angajat {

    public String nume;
    public int salariu;

    public Angajat(String nume, int salariu) {
        this.nume = verificaNume(nume);
        this.salariu = verificaSalariul(salariu);
    }

    //facem o metoda pentru verificarea numelui
    public String verificaNume(String nume){
        if(nume == null || nume.isEmpty()){
            return "Necunoscut";
        }
        return nume;
    }

    //facem o metoda sa verificam salariul
    public int verificaSalariul(int salariu){
        if(salariu <= 0){
            return 1500;
        }
        return salariu;
    }

    public String getNume() {
        return nume;
    }

    public int getSalariu() {
        return salariu;
    }
}

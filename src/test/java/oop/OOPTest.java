package oop;

import com.beust.ah.A;
import org.testng.annotations.Test;

public class OOPTest {

    @Test
    public void testMethod(){

        Student laura = new Student("Popescu", "Laura", 20, "Psihologie", true, "Filosofie");
        //laura.infoStudent();
        //laura.mananca();
        //laura.mergeLaCursuri();
        Angajat eduard = new Angajat("Ionescu", "Eduard", 25, "Arka", "inginer", 3);
        //eduard.infoAngajat();
        //eduard.mananca();
        //eduard.isiDaDemisia();
        //StudentAngajat marius = new StudentAngajat("Radu","Marius",22,"ASE",false,"Economie si Management","McDonald's","Vanzator",1);
        //marius.mergeLaPetreceri();
        //marius.primesteSalariu();
        eduard.progamLucru("Remote");
        eduard.programLucru(6);
        eduard.programLucru(false);
        eduard.programLucru();
    }
}

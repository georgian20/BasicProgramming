package obiectConstructor;

import org.testng.annotations.Test;

public class AvionTest {

    @Test
    public void testMethod(){
        Avion avion1 = new Avion("Militar", "Tiger", 2, 2014, "Bombardier");
        avion1.prezentareAvion();

        Avion avion2 = new Avion("Comercial", "Boeing", 350, 2020, 400, "747");
        avion2.prezentareAvion();
    }
}

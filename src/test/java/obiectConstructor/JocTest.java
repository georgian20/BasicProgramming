package obiectConstructor;

import org.testng.annotations.Test;

public class JocTest {

    @Test
    public void testJoc(){
        Joc joc1 = new Joc("Impossible", 100);
        System.out.println(joc1);
    }
}

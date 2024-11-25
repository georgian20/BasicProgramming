package oop.polimorfism.polimorfismStatic;

import org.testng.annotations.Test;

public class CalculeTest {

    @Test
    public void testAdunare(){
        Calcule calcule = new Calcule();
        System.out.println("Adunarea a doua int-uri este: "+calcule.adunare(5,83));
        System.out.println("Adunarea a doua double-uri este: "+calcule.adunare(5.89,154.33));
        System.out.println("Adunarea a doua String-uri este: "+calcule.adunare("Prima fraza ","A doua fraza"));
    }
}

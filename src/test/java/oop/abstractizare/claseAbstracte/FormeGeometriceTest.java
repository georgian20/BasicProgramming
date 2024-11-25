package oop.abstractizare.claseAbstracte;

import org.testng.annotations.Test;

public class FormeGeometriceTest {

    @Test
    public void testFormeGeometrice(){
        Patrat square = new Patrat();
        square.informatiiFormaGeometrica();
        square.deseneaza();

        Triunghi triangle = new Triunghi();
        triangle.informatiiFormaGeometrica();
        triangle.deseneaza();
        //Clasa abtracta, nu se poate instantia
        //FormeGeometrice fg = new FormeGeometrice();
    }
}

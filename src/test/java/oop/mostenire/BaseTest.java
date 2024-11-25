package oop.mostenire;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseTest {
    @BeforeClass
    public void setUp(){
        System.out.println("SetUp din clasa BaseTest");
    }

    @Test
    public void baseTest(){
        System.out.println("Executare base Test");
    }
}

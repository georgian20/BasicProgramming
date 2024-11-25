package oop.polimorfism.dinamic;

import org.testng.annotations.Test;

public class AnimalTest {

    @Test
    public void suneteAnimale(){
        Caine obiectCaine = new Caine();
        obiectCaine.sunetAnimal();
        Pisica obiectPisica = new Pisica();
        obiectPisica.sunetAnimal();
        Animal obiectAnimal = new Animal();
        obiectAnimal.sunetAnimal();
    }
}

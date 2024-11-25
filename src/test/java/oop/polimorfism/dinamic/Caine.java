package oop.polimorfism.dinamic;
//mosteneste clasa Animal
public class Caine extends Animal{

    public void sunetAnimal(){
        System.out.println("Cainele latra");
        super.sunetAnimal();
    }
}

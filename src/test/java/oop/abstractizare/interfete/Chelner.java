package oop.abstractizare.interfete;

public class Chelner implements Serveste,Curata{
    @Override
    public void curataMasa(int numarMasa) {
        System.out.printf("Chelnerul curata masa cu numarul: "+numarMasa);
    }

    @Override
    public void servesteMancare(int numarComanda, String tipulMancarii) {
        System.out.println("Chelnerul serveste comanda cu numarul: "+numarComanda+" care contine: "+tipulMancarii);

    }
}

package oop.abstractizare.interfete;

import org.testng.annotations.Test;

public class RestaurantTest {

    @Test
    public void activitatiRestaurant(){
        Bucatar chefBucatar = new Bucatar();
        chefBucatar.pregatesteMancarea("Sarmale");
        Chelner picolo = new Chelner();
        picolo.curataMasa(7);
        picolo.servesteMancare(45,"Pizza");
    }
}

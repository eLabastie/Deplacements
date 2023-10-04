package Mouvements;

import java.util.ArrayList;
import java.util.List;

public class Mouvements {

    public static String tourner(int nbre_tour) {

        List<String>Orientation = new ArrayList<String>();
        Orientation.add("Nord");
        Orientation.add("Est");
        Orientation.add("Sud");
        Orientation.add("Ouest");

        String orientationfinale =Orientation.get(nbre_tour%4);
        return orientationfinale;
    }
}

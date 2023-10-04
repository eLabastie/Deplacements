package Mouvements;

import java.util.ArrayList;
import java.util.List;

public class Mouvements {

    public int position_precedente = 0;

    public String tourner(int nbre_tour) {

        position_precedente += nbre_tour;
        List<String>Orientation = new ArrayList<String>();
        Orientation.add("Nord");
        Orientation.add("Est");
        Orientation.add("Sud");
        Orientation.add("Ouest");


        String orientationfinale =Orientation.get(position_precedente%4);

        return orientationfinale;
    }
}

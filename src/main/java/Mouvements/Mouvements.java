package Mouvements;

import java.util.ArrayList;
import java.util.List;

public class Mouvements {

    public static String tourner(int nbre_tour) {

        String orientation = "Nord";

        if (nbre_tour==1) {
             orientation = "Est";
        }

        if (nbre_tour==2) {
            orientation = "Sud";
        }

        if (nbre_tour==3) {
            orientation = "Ouest";
        }

        return orientation;
    }
}

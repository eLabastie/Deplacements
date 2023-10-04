import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions. *;

import Mouvements.Mouvements;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.util.ArrayList;
import java.util.List;

class MouvementsTest {

    private Mouvements monPersonnage;
    @BeforeEach
    void setUp() {  monPersonnage = new Mouvements(); }

    @AfterEach
    void tearDown() { monPersonnage  = null; }


    @Test
    void tourner_0_fois_doit_retourner_nord() {

        //GIVEN
        String expectedOrientation = "Nord";
        //WHEN
        String actualOrientation = monPersonnage.tourner(0);

        //THEN
        assertThat(actualOrientation).isEqualTo(expectedOrientation);
    }










    @Test
    void tourner_1_fois_doit_retourner_est() {

        //GIVEN
        String expectedOrientation = "Est";
        //WHEN
        String actualOrientation = monPersonnage.tourner(1);

        //THEN
        assertThat(actualOrientation).isEqualTo(expectedOrientation);
    }

    @Test
    void tourner_3_fois_doit_retourner_ouest() {

        //GIVEN
        String expectedOrientation = "Ouest";
        //WHEN
        String actualOrientation = monPersonnage.tourner(3);

        //THEN
        assertThat(actualOrientation).isEqualTo(expectedOrientation);
    }

    @Test
    void tourner_4_fois_doit_retourner_nord() {

        //GIVEN
        String expectedOrientation = "Nord";
        //WHEN
        String actualOrientation = monPersonnage.tourner(4);

        //THEN
        assertThat(actualOrientation).isEqualTo(expectedOrientation);
    }

    @Test
    void tourner_9_fois_doit_retourner_est() {

        //GIVEN
        String expectedOrientation = "Est";
        //WHEN
        String actualOrientation = monPersonnage.tourner(9);

        //THEN
        assertThat(actualOrientation).isEqualTo(expectedOrientation);
    }

    @Test
    void tourner_doit_prendre_en_compte_position_precedente() {

        //GIVEN

        String expectedOrientation = "Ouest";
        //WHEN
        monPersonnage.tourner(2);
        String actualOrientation = monPersonnage.tourner(1);

        //THEN
        assertThat(actualOrientation).isEqualTo(expectedOrientation);
    }
}
package reflection11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class SummerSolsticesTest {
    private Solstices solstices= new Solstices();

    @Test
    void getSummerSolsticeCountdown(LocalDate date) {

        LocalDate exp= LocalDate.of(01,02,2019);

        String actual= solstices.getSummerSolsticeCountdown(exp);
        String expected = "The Summer Solstice 2019 is on FRIDAY, JUNE 21, 2019 (in 140 days).";
        Assertions.assertEquals(expected,actual);

    }
}
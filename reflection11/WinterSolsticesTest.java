package reflection11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class WinterSolsticesTest {
    private Solstices solstices= new Solstices();

    @Test
    void getWinterSolsticeCountdown() {
        LocalDate exp= LocalDate.of(01,02,2019);

        String actual= solstices.getWinterSolsticeCountdown(exp);
        String expected = "The Winter Solstice 2019 is on SUNDAY, DECEMBER 22, 2019 (in 324 days).";
        Assertions.assertEquals(expected,actual);

    }
}
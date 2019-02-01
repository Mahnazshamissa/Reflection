package reflection11;

import java.time.Duration;
import java.time.LocalDate;

public class Solstices {

    private LocalDate today = LocalDate.now();

    public String getSummerSolsticeCountdown(LocalDate date){
        System.out.println("Input: " + this.today);
        Integer year = date.getYear();
        LocalDate SummerCountdown = LocalDate.of(20,06,year);

        if (date.isAfter(SummerCountdown)){
            year+=1;

            if ((year%4)==0) {
                SummerCountdown = LocalDate.of(20, 06, year);
            } else {
                SummerCountdown = LocalDate.of(21, 06, year);
            }

        }
        Duration duration = Duration.between(SummerCountdown,date);

        return "The Summer Solstice " + year +  "is on " + SummerCountdown.getDayOfWeek()
                + ", " + SummerCountdown + " (in " + duration +" days).";
    }

    public String getWinterSolsticeCountdown(LocalDate date){
        System.out.println("Input: " + this.today);
        Integer year = date.getYear();
        LocalDate WinterCountdown= LocalDate.of(21,12,year);
        if (date.isAfter(WinterCountdown)){
            year+=1;
            if ((year % 4) == 0) {
                WinterCountdown = LocalDate.of(22, 12, year);
            } else {
                WinterCountdown = LocalDate.of(21, 12, year);
            }
        }
        Duration duration = Duration.between(WinterCountdown,date);

        return "The Winter Solstice " + year +  "is on " + WinterCountdown.getDayOfWeek()
                + ", " + WinterCountdown + " (in " + duration +" days).";    }
}

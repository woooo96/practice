package Algorithm;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Pay {
    public int calculator (LocalDateTime startDateTime, LocalDateTime endDateTime) {
        int wage=9620;

        Long pay;
        Duration duration = Duration.between(startDateTime, endDateTime);
        System.out.println(duration.getSeconds()/60);

        LocalTime startTime = startDateTime.toLocalTime();
        LocalTime endTime = endDateTime.toLocalTime();
        LocalTime nightNTime = LocalTime.of(22,00);
        LocalTime nightMTime = LocalTime.of(06,00);

        //case1
        if(startDateTime.toLocalDate()==endDateTime.toLocalDate()) {
            if(startTime.isBefore(nightNTime) && endTime.isBefore(nightNTime)) {
                pay = (Duration.between(startDateTime, endDateTime).getSeconds()/60)*wage;
            }
            if(startTime.isBefore(nightNTime) && endTime.isAfter(nightNTime)) {
                pay = ((Duration.between(startDateTime, nightNTime).getSeconds()/60)*wage) + ((Duration.between(endDateTime, nightNTime).getSeconds()/60)*(int)(wage*1.5));
            }


        }


        return 1;

    }

    public static void main(String[] args) {

        Pay p = new Pay();
        p.calculator(LocalDateTime.of(2023,1,2,20,30), LocalDateTime.of(2023,1,3,02,20));




    }

}

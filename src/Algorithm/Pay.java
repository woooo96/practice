package Algorithm;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Pay {

//    public int calculator (LocalDateTime starDateTime, LocalDateTime endDateTime) {
//        LocalDateTime nightDateTime()
//        if ()
//
//    }

    public static void main(String[] args) {
        LocalDateTime startDateTime = LocalDateTime.of(2023,1,2,20,30);
        LocalDateTime endDateTime = LocalDateTime.of(2023,1,3,02,20);
        LocalDateTime nightDateTime = LocalDateTime.of(2023,1,3,02,20);

        Duration duration = Duration.between(startDateTime, endDateTime);
        System.out.println(duration.getSeconds()/60);

    }

}

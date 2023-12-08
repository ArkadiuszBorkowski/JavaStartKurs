package Daty;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;

public class TimeTest {
    public static void main(String[] args) {

//        tak zapisywano kiedyś, jest to nieefektywne i nie wykorzystywane obecnie
//        Date date = new Date(1999, 10, 10);
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println(simpleDateFormat.format(date));

        Instant i1 = Instant.now();
        for (int i = 0; i < 100; i++) {
            System.out.println("Miernik czasu");
        }
        Instant i2 = Instant.now();
        Duration timeGap = Duration.between(i1, i2);
        System.out.println(timeGap.getNano());
    }
}

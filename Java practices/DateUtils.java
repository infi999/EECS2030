package test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateUtils {
    
    public static Date getEndOfDay(Date day) {
        // your code here
        Instant instant = Instant.ofEpochMilli(day.getTime());
        // convert date to localdatetime
        LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        LocalDateTime time = LocalDateTime.of(ldt.getYear(), ldt.getMonth(), ldt.getDayOfMonth(), 23, 59, 59);
        // convert back
        ZonedDateTime zdt = time.atZone(ZoneId.systemDefault());
        Date date = Date.from(zdt.toInstant());
       
    	
    	
        return date;
    }
    
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(getEndOfDay(new Date()));
    }

}

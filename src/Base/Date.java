package Base;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
    public String getCurDate() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");  
        return currentDate.format(formatter);
    }

    public String SystemDate() {
        LocalDate currentDate = LocalDate.now();
        LocalDate systemDate = currentDate.minusDays(13);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");  
        return systemDate.format(formatter);
    }
}

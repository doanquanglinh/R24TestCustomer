package Base;
import java.util.Random;

public class employeeID {
    public static String generateRandomEmployeeID() {
        Random rand = new Random();
        int randomNum = rand.nextInt(900000) + 100000; 
        return "E" + randomNum;
    }
}

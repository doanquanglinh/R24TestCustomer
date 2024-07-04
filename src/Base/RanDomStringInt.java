package Base;
import java.util.Random;

public class RanDomStringInt {
    public static String genRandom() {
        Random random = new Random();
        StringBuilder cccd = new StringBuilder("0"); 
        
        for (int i = 0; i < 11; i++) {
            int digit = random.nextInt(10);
            cccd.append(digit);
        }
        return cccd.toString();
    }
}

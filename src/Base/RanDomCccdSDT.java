package Base;
import java.util.Random;

public class RanDomCccdSDT {
    public static String genRandomCCCD() {
        Random random = new Random();
        StringBuilder cccd = new StringBuilder("0"); 
        
        for (int i = 0; i < 11; i++) {
            int digit = random.nextInt(10);
            cccd.append(digit);
        }
        return cccd.toString();
    }
 /*   public static void main(String[] args) {
        String randomCCCD = generateRandomCCCD();
        System.out.println("Số CCCD ngẫu nhiên: " + randomCCCD);
    }*/
}

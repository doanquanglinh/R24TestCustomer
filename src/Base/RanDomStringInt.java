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
    

public static String generateRandomString(int length) {
    char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    StringBuilder sb = new StringBuilder();
    Random random = new Random();
    for (int i = 0; i < length; i++) {
        char c = chars[random.nextInt(chars.length)];
        sb.append(c);
    }
    return sb.toString();
}
}
package Base;

import java.util.Random;

public class randomString {
	  public static String randomStringChar(int length) {
	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        Random random = new Random();
	        StringBuilder result = new StringBuilder(length);

	        for (int i = 0; i < length; i++) {
	            result.append(characters.charAt(random.nextInt(characters.length())));
	        }
	        return result.toString();
	    }
}

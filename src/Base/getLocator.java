package Base;

public class getLocator {
    public String formatLocator(String locator, String... values) {
        int count = (locator.length() - locator.replace("%s", "").length()) / 2;
        if (count != values.length) {
            throw new IllegalArgumentException("Number of format specifiers does not match the number of values provided.");
        }
        return String.format(locator, (Object[]) values);
    }
}

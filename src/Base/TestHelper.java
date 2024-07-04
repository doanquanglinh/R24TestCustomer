package Base;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestHelper {

    public static void runTest(WebDriver driver, TestExecutor executor) {
        try {
            executor.execute();
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Test case failed due to exception: " + e.getMessage());
        } finally {
            if (driver != null) {
                driver.close();
            }
        }
    }

    @FunctionalInterface
    public interface TestExecutor {
        void execute() throws Exception;
    }
}
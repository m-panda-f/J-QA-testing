package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Maximize window and go to login URL
        driver.manage().window().maximize();
        driver.get("https://dev-dash.janitri.in/");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Cleanly close browser session
        }
    }
}

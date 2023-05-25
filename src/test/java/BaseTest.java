
import org.junit.jupiter.api.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


public class BaseTest {


    // Test başlamadan once driver'ı açmak için kullanılır.
    WebDriver driver;

    @BeforeAll
    public void setUp() {
        driver=new ChromeDriver();
        driver.get("https://www.amazon.com.tr/");
        driver.manage().window().maximize();

    }

    // Test bittikten sonra driver'ı kapatmak için kullanılır.
    @AfterAll
    public void tearDown() {
        driver.quit();
    }





}

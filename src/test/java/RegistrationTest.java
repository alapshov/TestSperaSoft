import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import webdriver.InizializeWebDriver;


public class RegistrationTest {

    WebDriver wd;

    @BeforeClass
    public void setUp() {

        wd = InizializeWebDriver.initializeChromeDriver("http://automationpractice.com/index.php?controller=authentication&back=my-account");

    }

    @AfterClass
    public void tearDown() {
        InizializeWebDriver.quitChromeDriver();
    }

    @Test
        @Parameters({"locator", "mail"})
    public void TestReg(String locator, String mail) {
       System.out.println(locator);
       System.out.println(mail);
    }
}

package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CreateAccountForm {
    public WebDriver wd;

    public void InitializeChromeDriver()
    {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.get("https://mail.ru/");
    }
    public void QuitCromeDriver()
    {
        wd.quit();
    }
}

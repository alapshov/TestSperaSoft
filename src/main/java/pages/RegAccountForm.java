package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testManager.ActionElements;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class RegAccountForm extends ActionElements {

    /**
     * Заполнение формы аккаунта
     *
     * @param sendkeysLocator
     * @param buttonLocator
     * @param sendKeys
     */
    public void enterAccountForm(String sendkeysLocator, String buttonLocator, String sendKeys) {
        findAndSandKeys(sendkeysLocator, sendKeys);
        findAndClick(buttonLocator);
    }
}

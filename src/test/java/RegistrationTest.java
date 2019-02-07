import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.RegAccountForm;
import pages.RegEnterEmail;
import webdriver.InizializeWebDriver;

import java.lang.reflect.Array;

import testManager.LocatorsToArrayList;
import testManager.SendKeysToMap;

import java.util.*;


public class RegistrationTest extends InizializeWebDriver {

    SendKeysToMap map = new SendKeysToMap();

    @BeforeClass
    public void setUp() {

        wd = InizializeWebDriver.initializeChromeDriver("http://automationpractice.com/index.php?controller=authentication&back=my-account");


    }

    @AfterClass
    public void tearDown() {
        InizializeWebDriver.quitChromeDriver();
    }

    @Test
    @Parameters({"sendkeyslocators", "buttonlocators", "sendkeys"})
    public void notCorrectMail(String sendkeyslocators, String buttonlocators, String sendkeys) {
        new RegEnterEmail().enterEmail(sendkeyslocators, buttonlocators, sendkeys);
        try {
            wd.findElement(By.cssSelector("#create_account_error ol li"));
        } catch (Exception ex) {
            Assert.fail("Не прошла проверка на корректность email или не найдено сообщение об ошибке");
        }

        try {
            wd.findElement(By.cssSelector("#center_column h1"));
        } catch (Exception ex) {
            Assert.fail("Не прошла не прошла проверка на корректность email или не найден заголовок Autentification ");
        }

    }

    @Test
    @Parameters({"sendkeysMaillocators", "sendkeysAccountLocators", "buttonlocatorAccount", "buttonlocatorsCreate", "sendkeys"})
    public void regAccount(String sendkeyslocators, String sendkeysAccountLocators, String buttonlocatorAccount, String buttonlocatorsCreate, String sendkeys) {
        new RegEnterEmail().enterEmail(sendkeyslocators, buttonlocatorsCreate, sendkeys);
        new RegAccountForm().enterAccountForm(sendkeysAccountLocators, buttonlocatorAccount, sendkeys);

        try {
            wd.findElement(By.cssSelector("#center_column h1"));
        } catch (Exception ex) {
            Assert.fail("Регистрация не завершилась или не найден заголовок");
        }

    }


}

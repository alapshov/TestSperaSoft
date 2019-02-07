package pages;

import org.openqa.selenium.By;
import testManager.ActionElements;
import webdriver.InizializeWebDriver;

import java.util.ArrayList;
import java.util.Arrays;

public class RegEnterEmail extends ActionElements {

    /**
     * Ввод емейла
     *
     * @param sendkeysLocator
     * @param buttonLocator
     * @param sendKeys
     */
    public void enterEmail(String sendkeysLocator, String buttonLocator, String sendKeys) {
        findAndSandKeys(sendkeysLocator, sendKeys);
        findAndClick(buttonLocator);
    }

}

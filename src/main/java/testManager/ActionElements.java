package testManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import webdriver.InizializeWebDriver;

import java.util.ArrayList;
import java.util.Map;

public class ActionElements extends InizializeWebDriver {
    private String sendKeys;
    private SendKeysToMap map = new SendKeysToMap();
    private ArrayList<String> locators = new ArrayList<String>();
    private LocatorsToArrayList locatorsToArrayList = new LocatorsToArrayList();
    private LocatorsToArrayList buttonLocatorsList = new LocatorsToArrayList();

    /**
     * Поиск и заполнение элементов
     *
     * @param sendkeysLocators принимает ArrayList<String>
     * @param sendKeys         принимает String
     * @return
     */
    public void findAndSandKeys(String sendkeysLocators, String sendKeys) {
        locators = locatorsToArrayList.getLocatorsToArrayList(sendkeysLocators);
        for (int i = 0; i < locators.size(); i++) {
            this.sendKeys = map.getSendKesyToMap(sendKeys).get(locators.get(i));
            wd.findElement(By.id(locators.get(i))).clear();
            wd.findElement(By.id(locators.get(i))).sendKeys(this.sendKeys);
        }


    }

    /**
     * Поиск и кли по элементу
     *
     * @param buttonLocators принимает ArrayList<String>
     */

    public void findAndClick(String buttonLocators) {
        for (int i = 0; i < buttonLocatorsList.getLocatorsToArrayList(buttonLocators).size(); i++) {
            wd.findElement(By.id(buttonLocatorsList.getLocatorsToArrayList(buttonLocators).get(i))).click();
        }

    }
}

package testManager;

import java.util.ArrayList;
import java.util.Arrays;

public class LocatorsToArrayList {

    /**
     * Преобразует строку с перечислением локаторов через запятую, в ArrayList
     *
     * @param locators - передается строка с перечислением локаторов через запятую
     * @return - возвращается ArrayList<String> c локаторами
     */

    public ArrayList<String> getLocatorsToArrayList(String locators) {

        return new ArrayList<String>(Arrays.asList(locators.split(",")));

    }


}

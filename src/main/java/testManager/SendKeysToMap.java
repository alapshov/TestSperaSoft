package testManager;

import java.util.*;

public class SendKeysToMap {


    private ArrayList<String> sendkeysList;
    private Map<String, String> mapList = new HashMap<String, String>();
    private ArrayList<String> arrayListForMap;

    /**
     * Преобразование ArrayList в MAP
     *
     * @param arrayList на вход поступает ArrayList
     * @return возвращаяется Map
     */
    private Map<String, String> arrayListToMap(ArrayList<String> arrayList) {

        for (int i = 0; i < arrayList.size(); i++) {
            arrayListForMap = new ArrayList<String>(Arrays.asList(arrayList.get(i).split("=")));
            mapList.put(arrayListForMap.get(0), arrayListForMap.get(1));
        }

        return mapList;
    }

    /**
     * Преоразование String в Map
     *
     * @param sendkeys на вход поступает строка
     * @return возращается Map
     */

    public Map<String, String> getSendKesyToMap(String sendkeys) {

        sendkeysList = new ArrayList<String>(Arrays.asList(sendkeys.split(",")));

        return arrayListToMap(sendkeysList);

    }


}

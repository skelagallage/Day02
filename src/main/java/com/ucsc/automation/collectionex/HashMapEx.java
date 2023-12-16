package com.ucsc.automation.collectionex;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Sanath", 35);
        map.put("Haritha", 25);
        map.put("Dewmini", 23);

        for (Map.Entry<String, Integer> element :
                map.entrySet()) {
            String key = element.getKey();
            int value = element.getValue();
            System.out.println("The key is " + key + " and value is "
                    + value);
        }
    }
}

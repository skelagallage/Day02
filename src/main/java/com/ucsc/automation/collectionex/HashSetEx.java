package com.ucsc.automation.collectionex;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Sanath");
        stringSet.add("Haritha");
        stringSet.add("Dewmini");
        stringSet.add("Sanath");

        for (String element :
                stringSet) {
            System.out.println("Name is : " + element);
        }
    }
}

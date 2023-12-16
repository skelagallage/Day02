package com.ucsc.automation.collectionex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Sanath");
        stringList.add("Haritha");
        stringList.add("Dewmini");
        stringList.add("Sanath");

        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()){
            System.out.println("Name is " + iterator.next());
        }

//        for (String element :
//                stringList) {
//            System.out.println("Name is " + element);
//        }
    }
}

package com.bootcampexercise.module8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CollectionLearn {
    private final ArrayList<String> arrayList;
    private final HashSet<String> hashSet;
    private final HashMap<Integer, String> hashMap;

    public CollectionLearn() {
        arrayList = new ArrayList<>();
        hashSet = new HashSet<>();
        hashMap = new HashMap<>();
    }

    public void addValues() {
        for (int i = 1; i <= 10; i++) {
            arrayList.add("ListValue" + i);
        }

        for (int i = 1; i <= 10; i++) {
            hashSet.add("SetValue" + i);
        }

        for (int i = 1; i <= 10; i++) {
            hashMap.put(i, "MapValue" + i);
        }
    }

    public void printArrayList() {
        System.out.println("ArrayList Values:");
        for (String value : arrayList) {
            System.out.println(value);
        }
    }

    public void printHashSet() {
        System.out.println("\nHashSet Values:");
        for (String value : hashSet) {
            System.out.println(value);
        }
    }

    public void printHashMap() {
        System.out.println("\nHashMap Values:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    /**
     * @author Markuss
     * @purpose call ArrayList, HashSet and HashMap methods to add and print elements in each
     * @output ArrayList Values:
     * ListValue1
     * ListValue2
     * ListValue3
     * ListValue4
     * ListValue5
     * ListValue6
     * ListValue7
     * ListValue8
     * ListValue9
     * ListValue10
     *
     * HashSet Values:
     * SetValue3
     * SetValue10
     * SetValue4
     * SetValue5
     * SetValue6
     * SetValue1
     * SetValue2
     * SetValue7
     * SetValue8
     * SetValue9
     *
     * HashMap Values:
     * Key: 1, Value: MapValue1
     * Key: 2, Value: MapValue2
     * Key: 3, Value: MapValue3
     * Key: 4, Value: MapValue4
     * Key: 5, Value: MapValue5
     * Key: 6, Value: MapValue6
     * Key: 7, Value: MapValue7
     * Key: 8, Value: MapValue8
     * Key: 9, Value: MapValue9
     * Key: 10, Value: MapValue10
     *
     * Process finished with exit code 0
     */
    static void main() {
        CollectionLearn obj = new CollectionLearn();

        obj.addValues();

        obj.printArrayList();
        obj.printHashSet();
        obj.printHashMap();
    }
}

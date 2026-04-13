package com.bootcampexercise.module10;

import java.util.HashMap;

public class ElectronicItemDetails {

    public static double returnPriceOfItem(HashMap<String, Double> itemHashMap, String name){
        return itemHashMap.getOrDefault(name, -1.0);
    }

    /**
     * @author Markuss
     * @purpose Create a HashMap abject of common electronic devices and their price
     * @output Price of TV is 299.99
     * Process finished with exit code 0
     */
    static void main() {
        HashMap<String, Double> itemHashMap = new HashMap<>();
        itemHashMap.put("TV", 299.99);
        itemHashMap.put("Refrigerator", 149.99);
        itemHashMap.put("Washing Machine", 149.99);
        itemHashMap.put("Laptop", 799.99);

        System.out.printf("Price of TV is %.2f", ElectronicItemDetails.returnPriceOfItem(itemHashMap, "TV"));
    }
}

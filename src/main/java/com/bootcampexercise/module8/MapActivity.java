package com.bootcampexercise.module8;

import java.util.HashMap;
import java.util.Map;

public class MapActivity {
    /**
     * @author Markuss
     * @purpose call HashMap methods to manipulate elements within the map
     * @output 1313: Billy
     * 1212: James
     * 2121: Jenna
     *
     * Process finished with exit code 0
     */
    static void main() {
        // 1 - Write code to create a HashMap of key value pair
        // where key is id of type String and value is a name also of type String
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("2121", "Jenna");
        hashMap.put("1212", "James");
        hashMap.put("1313", "Billy");
        // 2 - Call print method to print the map passed as its parameter.
        print(hashMap);
    }

    static void print(HashMap<String, String> map) {
        //3 - Write code to print this map
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

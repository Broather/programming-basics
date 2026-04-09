package com.bootcampexercise.module8;

import java.util.HashSet;

public class SetActivity {
    /**
     * @author Markuss
     * @purpose call HashSet methods to manipulate elements within the set
     * @output -------------
     * Bryan
     * Disha
     * John
     * Mary
     * -------------
     * Disha
     * John
     * -------------
     * index of Disha is 0
     *
     * Process finished with exit code 0
     */
    static void main() {
        // Create a Hashset of name - 10
        HashSet<String> hashSet = new HashSet<>(10);

        // Print by iteration
        for (Object o : hashSet){
            System.out.println(o);
        }
        System.out.println("-------------");

        // Add duplicate values in the set - 2
        hashSet.add("Mary");
        hashSet.add("Mary");
        hashSet.add("Disha");
        hashSet.add("John");
        hashSet.add("Bryan");

        // Print by iteration
        for (Object o : hashSet){
            System.out.println(o);
        }
        System.out.println("-------------");
        // Remove 2 values
        hashSet.remove("Mary");
        hashSet.remove("Bryan");

        // Print by iteration
        for (Object o : hashSet){
            System.out.println(o);
        }
        System.out.println("-------------");
        // Find the index of name <Disha> in the HashSet
        int i = 0;
        for (Object o : hashSet){
            if(o.equals("Disha")){
                System.out.println("index of Disha is " + i);
            }
            ++i;
        }
    }
}

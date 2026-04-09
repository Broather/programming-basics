package com.bootcampexercise.module8;

import java.util.ArrayList;
import java.util.Arrays;

public class ListActivity {
    static void main() {
        //TODO: 1 - Write code to create a list of names. Use ArrayList.
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("John", "Bob", "Carl"));
        //TODO: 2 - Call print method to print the list passed as its parameter.
        print(arr);
    }

    static void print(ArrayList<String> list) {
        //TODO: 3 - Write code to print this list
        System.out.println(list);
        //Notice the order in which elements get printed.
    }
}

package com.bootcampexercise.module9;

public class Person {

    private int weight;
    private float height;

    //TODO: Create getters and setters for weight and height
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    // Note: All TODOs should be implemented in single method
    // TODO: Create a method to calculate humans body mass index with two parameters for height and weight
    public String calculateBMI(){
        float maxHeight = 2.20f;
        int maxWeight = 300;

    // TODO: Please add some checks for max weight and height (kg and meter are their units)
        if (height > maxHeight || weight > maxWeight){
            return "Invalid input: height and weight are greater than the maximum.";
    // TODO: Also add some checks that value shouldn't be negative and 0
        } else if (height <= 0 || weight <= 0) {
            return "Invalid input: height and weight must be positive.";
        }
    // TODO: return String which indicates persons BMI. Calculation should be used weight/(height*height)
        return String.format("Person's BMI is %.2f", weight / (height * height));
    }


}

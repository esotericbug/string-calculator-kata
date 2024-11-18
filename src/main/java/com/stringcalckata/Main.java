package com.stringcalckata;

public class Main {
    /*
     * This method takes in a string of comma-seperated numbers as input and
     * calculates the sum of all of them
     * 
     * @param numbers
     */
    public int add(String numbers) {
        // adds a check if length of string is less than 2
        if (numbers.length() < 2) {
            // check if the string is empty return 0
            if (numbers.isEmpty()) {
                return 0;
            } else {
                // there is only 1 number therefore return the number as the sum
                return Integer.parseInt(numbers);
            }
        } else {
            // TODO
            return 0;
        }
    }

}
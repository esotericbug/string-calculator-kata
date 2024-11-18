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
            String delimiter = ",";
            /*
             * check if the input string matches the regex to check if there is a different
             * delimiter than and if exists extract that delimiter and the subsequent
             * 
             * https://regex101.com/r/2184rg/1
             */
            if (numbers.matches("\\/\\/(.{1})\\n(.*)")) {
                delimiter = Character.toString(numbers.charAt(2));
                numbers = numbers.substring(4);
            }

            String[] numbersList = numbers.split(delimiter);
            
            // TODO
            return 0;
        }
    }

}
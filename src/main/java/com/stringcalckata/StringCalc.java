package com.stringcalckata;

import java.util.ArrayList;

public class StringCalc {
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

            // add \n as optional delimiter
            delimiter = delimiter + "|\n";

            String[] numbersList = numbers.split(delimiter);

            return sum(numbersList);
        }
    }

    private int sum(String[] numbers) {
        int total = 0;
        ArrayList<String> negativeNums = new ArrayList<String>();

        for (int i = 0; i < numbers.length; i++) {
            // check if a number is negative and add it to the negative nums array
            if (Integer.parseInt(numbers[i]) < 0) {
                negativeNums.add(numbers[i]);
            }
            // if number is not negative add it to the totals
            else {
                total += Integer.parseInt(numbers[i]);
            }
        }

        // if negative nums size is not zero then throw error
        if (negativeNums.size() != 0) {
            throw new IllegalArgumentException("negative numbers not allowed -> " + String.join(",", negativeNums));
        }

        return total;
    }
}


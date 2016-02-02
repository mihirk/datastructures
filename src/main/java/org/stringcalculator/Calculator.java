package org.stringcalculator;

public class Calculator {
    public int add(String inputString) {
        int sum = 0;
        if (!inputString.isEmpty()) {
            for (String number : inputString.split(",")) {
                sum += Integer.parseInt(number.trim());
            }
        }
        return sum;
    }
}

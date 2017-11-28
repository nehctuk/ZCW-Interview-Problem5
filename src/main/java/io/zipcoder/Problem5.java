package io.zipcoder;

public class Problem5 {
    public String returnCorrectReversedString(String input) {
        input = uncapitalizeFirstLetters(input);
        input = reverseString(input);
        input = capitalizeFirstLetters(input);
        return input;
    }

    public String reverseString(String input){
        StringBuilder output = new StringBuilder();
        for (int x = input.split("").length-1; x >= 0 ; x--) {
            output.append(input.split("")[x]);
        }
        return output.toString();
    }

    public String capitalizeFirstLetters(String input) {
        StringBuilder output = new StringBuilder();
        for (int x = 0; x < input.split("").length; x++) {
            if ((x>0 && input.split("")[x-1].equals(" ")) || x==0) {
                output.append(input.split("")[x].toUpperCase());
            }
            else {
                output.append(input.split("")[x]);
            }
        }
        return output.toString();
    }

    public String uncapitalizeFirstLetters(String input) {
        StringBuilder output = new StringBuilder();
        for (int x = 0; x < input.split("").length; x++) {
            if ((x>0 && input.split("")[x-1].equals(" ")) || x==0) {
                output.append(input.split("")[x].toLowerCase());
            }
            else {
                output.append(input.split("")[x]);
            }
        }
        return output.toString();
    }
}

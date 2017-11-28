package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem5Test {

    Problem5 problem5 = new Problem5();
    String input = "I love UNIT Testing";

    @Test
    public void reverseStringTest() {
        String expected = "gnitseT TINU evol I";
        String actual = problem5.reverseString(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void uncapitalizeFirstLettersTest() throws Exception {
        String expected = "i love uNIT testing";
        String actual = problem5.uncapitalizeFirstLetters(input);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void capitalizeFirstLettersTest() throws Exception {
        String expected = "I Love UNIT Testing";
        String actual = problem5.capitalizeFirstLetters(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void returnCorrectReversedStringTest() {
        String expected = "Gnitset TINU Evol I";
        String actual = problem5.returnCorrectReversedString(input);
        Assert.assertEquals(expected,actual);
    }
}

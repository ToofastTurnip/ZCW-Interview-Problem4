package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem4Test {

    @Test
    public void palindromeTest1() {
        Problem4 problem4 = new Problem4();
        String expected = "YES";
        String actual = problem4.checkPalindrome("aaabbbb");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void palindromeTest2() {
        Problem4 problem4 = new Problem4();
        String expected = "NO";
        String actual = problem4.checkPalindrome("cdefghmnopqrstuvw");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void palindromeTest3() {
        Problem4 problem4 = new Problem4();
        String expected = "YES";
        String actual = problem4.checkPalindrome("cdcdcdcdeeeef");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortStringTest() {
        Problem4 problem4 = new Problem4();
        String expected = "aaabbb";
        String actual = problem4.sortString("ababab");
        Assert.assertEquals(expected, actual);
    }

}

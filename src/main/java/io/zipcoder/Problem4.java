package io.zipcoder;

import java.util.Arrays;

public class Problem4 {

    public String checkPalindrome(String string) {
        int count = 1;
        int oddCount = 0;
        string = sortString(string);
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i)==string.charAt(i-1)) {
                count++;
            } else {
                if (count%2!=0) {
                    oddCount++;
                }
                count = 1;
            }
        }
        if (oddCount > 1) return "NO";
        return "YES";
    }

    public String sortString(String string) {
        char tempArray[] = string.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

}

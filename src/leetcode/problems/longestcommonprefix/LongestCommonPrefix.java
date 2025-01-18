package leetcode.problems.longestcommonprefix;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        var longestPrefix = "";

        //For each character size prefix
        //Up to character size of the first String. The actual max size would be the smallest String
        //But we can validate that on the flight
        for (int i = 0; i < strs[0].length(); i++) {
            System.out.println("Trying to find prefixes of length: "+i+1);
            System.out.println("Current longest prefix: "+longestPrefix);

            //For each String, get its prefix of 'i' length
            var prefixList = new String[strs.length];
            for (int j = 0; j < strs.length; j++) {
                // if the prefix size to find is larger than the string length, stop de search.
                if (i == strs[j].length()) {
                    return longestPrefix;
                }
                prefixList[j] = strs[j].substring(0, i+1);
            }

            System.out.println("Current lits of prefixes: "+Arrays.toString(prefixList));

            //Check if all elements are the same, if they are, its the same prefix, if not, then end the search.
            if (checkIfAllElementsAreEqual(prefixList)) {
                System.out.println("All prefixes were equal. Now trying with one more character.");
                longestPrefix = prefixList[0];
            } else {
                System.out.println("One of the prefixes were not equal, search ended.");
                break;
            }
        }

        return longestPrefix;
    }

    private static boolean checkIfAllElementsAreEqual(String[] strs) {
        var allElementsEqual = true;
        for (int j = 0; j < strs.length-1; j++) {
            if (!strs[j].equals(strs[j+1])) {
                allElementsEqual = false;
                break;
            }
        }
        return allElementsEqual;
    }

}

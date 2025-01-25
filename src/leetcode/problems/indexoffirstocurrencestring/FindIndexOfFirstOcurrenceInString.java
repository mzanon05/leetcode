package leetcode.problems.indexoffirstocurrencestring;

public class FindIndexOfFirstOcurrenceInString {

    public static int strStr(String haystack, String needle) {

        System.out.println("String to find: "+needle);
        System.out.println("String to be searched: "+haystack);

        if (needle.length() > haystack.length()) {
            return -1;
        }
        if (needle.length() == haystack.length()) {
            return haystack.equals(needle) ? 0 : -1;
        }

        for (int i = 0; i < haystack.length(); i++) {
            var j = 0;
            for (;j < needle.length() && i+j < haystack.length(); j++) {
                var iChar = haystack.charAt(i+j);
                var jChar = needle.charAt(j);
                System.out.println("Char(i+j="+(i+j)+") at word '"+haystack+"': "+iChar);
                System.out.println("Char(j="+j+") at needle '"+needle+"': "+jChar);
                if (haystack.charAt(i+j) != needle.charAt(j)) {
                    System.out.println("Chars are different, breaking and restarting at next 'i' value.");
                    break;
                }
                System.out.println("Chars are equal, continuing...");
            }
            if (j == needle.length()) {
                //If we got here then it means that we found the 'needle' starting at 'i' index
                return i;
            }
        }
        return -1;
    }

    public static int strStrV2(String haystack, String needle) {

        System.out.println("String to find: "+needle);
        System.out.println("String to be searched: "+haystack);

        if (needle.length() > haystack.length()) {
            return -1;
        }
        if (needle.length() == haystack.length()) {
            return haystack.equals(needle) ? 0 : -1;
        }

        // Sliding window aproach
        // This first loop (i) defines the start of the 'window' being searched
        // Ends at size difference between the two strings to ensure that we only loop when we can still
        //possibly find a string of size 'm' starting at the current index from the 'n' string
        // The +1 is because we still want to search the last index. Ex: length=3 but the index ony goes to 2
        // Ex: n='abc' and m='c' n-m=2 and at index 2 of the 'n' string we would find the 'm' string
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            // This second loop (j) compares the characters at the current window to find a match
            var j = 0;
            for (; j < needle.length(); j++) {
                var iChar = haystack.charAt(i+j);
                var jChar = needle.charAt(j);
                System.out.println("Char(i="+i+"+j="+j+"="+(i+j)+") at word '"+haystack+"': "+iChar);
                System.out.println("Char(j="+j+") at needle '"+needle+"': "+jChar);
                if (haystack.charAt(i+j) != needle.charAt(j)) {
                    System.out.println("Chars are different, breaking and restarting at next 'i' value.");
                    break;
                }
                System.out.println("Chars are equal, continuing...");
            }
            if (j == needle.length()) {
                //If we got here then it means that we found the 'needle' starting at 'i' index
                return i;
            }
        }
        return -1;
    }
}

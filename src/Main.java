import leetcode.problems.indexoffirstocurrencestring.FindIndexOfFirstOcurrenceInString;
import leetcode.problems.longestcommonprefix.LongestCommonPrefix;
import leetcode.problems.palindrome.PalindromeNumber;
import leetcode.problems.removeduplicatesarray.RemoveDuplicatesFromArray;
import leetcode.problems.removeelementfromarray.RemoveElementFromArray;
import leetcode.problems.romantointeger.RomanToInteger;
import leetcode.problems.searchinsertposition.SearchInsertPostion;
import leetcode.problems.twosum.TwoSum;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Response: "+Arrays.toString(TwoSum.twoSumSolutionOne(new int[]{2, 7, 11, 15}, 9)));
        //System.out.println("Response: "+Arrays.toString(TwoSum.twoSumSolutionOne(new int[]{3,2,4}, 6)));

        //System.out.println("Response: "+RomanToInteger.romanToIntegerSolutionOne("XVI"));
        //System.out.println("Response: "+RomanToInteger.romanToIntegerSolutionOne("XIV"));

        //System.out.println("Response: "+PalindromeNumber.isPalindromeSolutionOne(12321));

        //System.out.println("Response: "+LongestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flowing"}));
        //System.out.println("Response: "+LongestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));

        //System.out.println("Response: "+ RemoveDuplicatesFromArray.removeDuplicates(new int[]{1,1,2}));
        //System.out.println("Response: "+ RemoveDuplicatesFromArray.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));

        //System.out.println("Response : "+ RemoveElementFromArray.removeElement(new int[]{3, 2, 2, 3}, 3));
        //System.out.println("Response : "+ RemoveElementFromArray.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));

        //System.out.println("Response : "+ FindIndexOfFirstOcurrenceInString.strStr("sadbutsad", "sad"));
        //System.out.println("Response : "+ FindIndexOfFirstOcurrenceInString.strStr("leetcode", "leeto"));
//        System.out.println("Response : "+ FindIndexOfFirstOcurrenceInString.strStrV2("mississippi", "issipi"));
//        System.out.println("Response : "+ FindIndexOfFirstOcurrenceInString.strStrV2("mississippi", "issip"));
//        System.out.println("Response : "+ FindIndexOfFirstOcurrenceInString.strStrV2("abc", "c"));

//        System.out.println("Response : "+ SearchInsertPostion.searchInsertV1(new int[]{1,3,5,6}, 5));
        System.out.println("Response : "+ SearchInsertPostion.searchInsertV2(new int[]{1,3,5,6}, 5));
//        System.out.println("Response : "+ SearchInsertPostion.searchInsertV2(new int[]{1,3,5,6}, 2));
    }

}
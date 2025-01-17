import leetcode.problems.romantointeger.RomanToInteger;
import leetcode.problems.twosum.TwoSum;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(TwoSum.twoSumSolutionOne(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(TwoSum.twoSumSolutionOne(new int[]{3,2,4}, 6)));

        System.out.println(RomanToInteger.romanToIntegerSolutionOne("XVI"));
        System.out.println(RomanToInteger.romanToIntegerSolutionOne("XIV"));
    }

}
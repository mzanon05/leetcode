package leetcode.problems.removeelementfromarray;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RemoveElementFromArray {

    /**
        Input: nums = [0,1,2,2,3,0,4,2], val = 2
        Output: 5, nums = [0,1,4,0,3,_,_,_]
        Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
        Note that the five elements can be returned in any order.
        It does not matter what you leave beyond the returned k (hence they are underscores).
    */
    public static int removeElement(int[] nums, int val) {
        Queue<Integer> availableIndexes = new LinkedList<>();
        var numbersRemoved = 0;

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Current available indexes list: "+availableIndexes);
            System.out.println("Current numns array: "+ Arrays.toString(nums));
            //  If the number is to be removed, mark its index as available and continue.
            //  If not, then check if there is any available indexes and move the number to it.
            // if there isnt any index available, then simply continue.
            if (nums[i] == val) {
                availableIndexes.add(i);
                numbersRemoved++;
            } else if (!availableIndexes.isEmpty()) {
                nums[availableIndexes.poll()] = nums[i];
                availableIndexes.add(i);
            }
        }

        System.out.println("\nFinal array: "+ Arrays.toString(nums));
        return nums.length - numbersRemoved;
    }

}

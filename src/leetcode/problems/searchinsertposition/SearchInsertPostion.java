package leetcode.problems.searchinsertposition;

import java.util.Arrays;

public class SearchInsertPostion {

    public static int searchInsertV1(int[] nums, int target) {
        System.out.println("Array: "+ Arrays.toString(nums));
        System.out.println("Target: "+target);

        if (target < nums[0]) {
            return 0;
        }

        //Look at the sorter array and try to find the target.
        //At each element, check if the next is greater, if it is, then we found the index do insert our target
        for (int i = 0; i < nums.length; i++) {
            //If we found our target
            if (nums[i] == target) {
                return i;
            }
            //If we searched the entire array and didn't find our target, we should insert it at the end
            if (i+1 == nums.length) {
                return nums.length;
            }
            //If the next element is greater than the current,  whe should insert target at 'i'
            if (nums[i+1] > target) {
                return i+1;
            }
        }

        return -1;
    }

    public static int searchInsertV2(int[] nums, int target) {
        System.out.println("Array: "+ Arrays.toString(nums));
        System.out.println("Target: "+target);

        var leftIndex = 0;
        var rightIndex = nums.length-1;

        //While the left index is smaller or equal to the right index, keep dividing and searching
        while (leftIndex <= rightIndex) {
            var middleIndex = (leftIndex+rightIndex)/2;
            System.out.println("Left index: "+leftIndex);
            System.out.println("Middle index: "+middleIndex);
            System.out.println("Right index: "+rightIndex);
            //If the number is less than the middle point, we need to look at the left part, else in the right part.
            if (target < nums[middleIndex]) {
                System.out.println("Target is to the left of the array");
                rightIndex = middleIndex-1;
            } else if (target > nums[middleIndex]){
                System.out.println("Target is to the right of the array");
                leftIndex = middleIndex+1;
            } else {
                return middleIndex;
            }
        }

        return leftIndex;
    }

}

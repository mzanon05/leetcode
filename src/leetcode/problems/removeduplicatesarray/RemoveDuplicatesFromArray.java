package leetcode.problems.removeduplicatesarray;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

    public static int removeDuplicates(int[] nums) {
        //Position where the next unique element will be placed in the array
        var currentAvailableIndex = 0;
        var numberOfUniqueNumbers = 0;

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Current array: "+ Arrays.toString(nums));
            System.out.println("Current available index: "+currentAvailableIndex);
            System.out.println("Current number of unique numbers: "+numberOfUniqueNumbers);
            //Check if the current number is equal do the previous number checked
            //  Since the array is sorted, if the number is different, its a 'new' unique number
            // and if the number is equal, then its a repeated occurrence and can be 'skipped'.
            if (i != 0 && nums[i] == nums[i-1]) {
                continue;
            } else {
                //New unique number found, place the number at the current available position
                nums[currentAvailableIndex] = nums[i];
                currentAvailableIndex++;
                numberOfUniqueNumbers++;
            }

        }

        System.out.println("Final array: "+Arrays.toString(nums));
        return numberOfUniqueNumbers;
    }

}

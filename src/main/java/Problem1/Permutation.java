package Problem1;

import java.util.ArrayList;
import java.util.List;

/*
references I used
https://www.programcreek.com/2013/02/leetcode-permutations-java/
https://www.geeksforgeeks.org/iterative-approach-to-print-all-permutations-of-an-array/
 */
public class Permutation {
    public static List<List<Integer>> permute(int[] nums) {
        // homework
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length == 0) {
            result.add(new ArrayList<>());
        }
        permutationHelper(nums, 0, result);
        return result;
    }

    private static void permutationHelper(int[] nums, int position, List<List<Integer>> result) {

        List<Integer> resultTwo = new ArrayList<>();
        if (position == nums.length - 1) {
            List<Integer> resultOne = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                resultOne.add(nums[i]);
            }
            result.add(resultOne);
            return;
        }

        for (int i = position; i < nums.length; i++) {
            swap(nums, i, position);
            permutationHelper(nums, position + 1, result);
            swap(nums, i, position);
        }

    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

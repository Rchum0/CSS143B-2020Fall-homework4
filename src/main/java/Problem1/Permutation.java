package Problem1;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<List<Integer>> permute(int[] nums) {
        // homework
        List<List<Integer>> result = new ArrayList<>();
        permutationHelper(nums, 0, result);
        return result;
    }

    private static void permutationHelper(int[] nums, int position, List<List<Integer>> result) {
        if (nums == null || nums.length == 0) {
            List<Integer> resultOne = new ArrayList<>();
            result.add(resultOne);
            return;
        }

        if (position == nums.length - 1) {
            List<Integer> resultOne = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                resultOne.add(nums[i]);
            }
            result.add(resultOne);
            return;
        }

        for (int i = 0; i < nums.length - 1; i++) {

            int temp = nums[i];
            nums[i] = nums[position];
            nums[position] = temp;

            permutationHelper(nums, position + 1, result);

            temp = nums[i];
            nums[i] = nums[position];
            nums[position] = temp;
        }
    }
}

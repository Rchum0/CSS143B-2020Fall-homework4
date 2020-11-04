package Problem1;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<List<Integer>> permute(int[] nums) {
        // homework
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        boolean[] used = new boolean[nums.length];
        List<Integer> permutation = new ArrayList<>();
        helper(nums, permutation, used, result);
        return result;
    }

    private static void helper(int[] nums, List<Integer> permutation, boolean[] used, List<List<Integer>> result) {
        if (permutation.size() == nums.length) {
            result.add(new ArrayList<>(permutation));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;
            used[i] = true;
            permutation.add(nums[i]);
            helper(nums, permutation, used, result);
            permutation.remove(permutation.size() - 1);
            used[i] = false;
        }
    }
}

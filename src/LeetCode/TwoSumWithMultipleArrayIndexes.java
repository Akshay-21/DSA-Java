package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSumWithMultipleArrayIndexes {

    public static void main(String[] args) {

        TwoSumWithMultipleArrayIndexes solution = new TwoSumWithMultipleArrayIndexes();
        int[] nums = {1, 2, 3, 5, 4};
        int target = 7;
        List<int[]> results = solution.twoSum(nums, target);

        for (int[] pair : results) {
            System.out.println("[" + pair[0] + ", " + pair[1] + "]");
        }
    }

    public List<int[]> twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        List<int[]> result = new ArrayList<>();

        // Add numbers and their indexes to the HashMap
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // if complement exists in hash map and current index is different
            if (numMap.containsKey(complement)) {
                result.add(new int[]{numMap.get(complement), i});
            }
            // Add the current number and its index to the HashMap
            numMap.put(nums[i], i);
        }
        return result;
    }
}

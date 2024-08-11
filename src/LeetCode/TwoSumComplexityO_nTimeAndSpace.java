package LeetCode;


import java.util.HashMap;
import java.util.Map;

/**
 * The program Time & Space complexity is O(n).
 */

public class TwoSumComplexityO_nTimeAndSpace {

    public static void main(String[] args) {

      /*  int[] num = {2, 7, 11, 15};
        int target = 9; */
        int[] num = {3, 2, 4, 9};
        int target = 6;

        System.out.println("==== Using Two Pass Hashmap =====");

        int[] indexValue = getTwoSumIndexes(num, target);
        for (int a : indexValue) {
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.println("===== Using One Pass Hashmap =====");

        int[] twoSumIndex = twoSum(num, target);
        for (int b : twoSumIndex) {
            System.out.print(b + " ");
        }
    }

    /**
     * Two-pass HashMap
     */
    private static int[] getTwoSumIndexes(int[] num, int target) {

        HashMap<Integer, Integer> elementHashMap = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            elementHashMap.put(num[i], i);
        }

        for (int i = 0; i < num.length; i++) {
            int complementValue = target - num[i];
            if (elementHashMap.containsKey(complementValue) && elementHashMap.get(complementValue) != i) {
                return new int[]{i, elementHashMap.get(complementValue)};
            }
        }
        return new int[]{};
    }

    /**
     * One Pass HashMap
     */

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        // Find the complement
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;

            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(num, i);
        }
        return new int[]{}; // No solution found
        // OR
        // If no solution is found, throw an exception
        // throw new IllegalArgumentException("No two sum solution");
    }
}
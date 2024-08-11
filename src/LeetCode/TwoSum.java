package LeetCode;

import org.jetbrains.annotations.NotNull;

/**
 * Brute Force Solution
 * The program complexity is O(n2).
 */

public class TwoSum {
    public static void main(String[] args) {

        int[] num = {2, 7, 11, 15};
        int target = 9;
        int[] indexValue = getArrayIndexes(num, target);

        for (int i = 0; i < indexValue.length; i++) {
            System.out.println(indexValue[i]);
        }
    }

    @NotNull
    private static int[] getArrayIndexes(int[] num, int target) {
        int[] indexValue = new int[2];
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    indexValue[0] = i;
                    indexValue[1] = j;
                }
            }
        }
        return indexValue;
    }
}

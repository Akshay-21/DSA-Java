package Array;

public class SumOfTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = new int[]{3, 1, 0, 7, 5};
        int[] arr2 = new int[]{1, 1, 1, 1, 1, 1};

        int max = getMaxLengthFromArray(arr1.length, arr2.length);

        int[] sum = new int[max];

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;

        int c = 0;

        while (k >= 0) {

            int d = c;

            if (i >= 0) {
                d = d + arr1[i];
            }

            if (j >= 0) {
                d = d + arr2[j];
            }

            c = d / 10;
            d = d % 10;

            sum[k] = d;
            i--;
            j--;
            k--;
        }

        if (c != 0) {
            System.out.println(c);
        }

        for (int val : sum) {
            System.out.println(val);
        }

    }

    private static int getMaxLengthFromArray(int length1, int length2) {
        int max = 0;
        if (length1 > length2) {
            max = length1;
        } else {
            max = length2;
        }
        return max;
    }
}

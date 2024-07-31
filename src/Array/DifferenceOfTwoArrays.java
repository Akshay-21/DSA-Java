package Array;

public class DifferenceOfTwoArrays {

    public static void main(String[] args) {

        int n1 = 5;
        int n2 = 6;
        int[] arr1 = new int[]{2, 3, 4, 6, 9};
        int[] arr2 = new int[]{1, 1, 1, 1, 1, 1};

        int max = getMaxLengthFromTwoArrays(arr1.length, arr2.length);

        int diff[] = new int[max];
        int c = 0;

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diff.length - 1;

        while (k >= 0) {
            int d = 0;
            int a1v = i>=0 ? arr1[i]:0;
            if (arr2[j] + c >= a1v) {
                d = arr2[j] + c - a1v;
                c = 0;
            } else {
                d = arr2[j] + c + 10 - a1v;
                c = -1;
            }

            diff[k] = d;

            i--;
            j--;
            k--;
        }

        int idx = 0;
        while (idx < diff.length) {
            if (diff[idx] == 0) {
                idx++;
            } else {
                break;
            }
        }

        while (idx < diff.length) {
            System.out.println(diff[idx]);
            idx++;
        }
    }

    private static int getMaxLengthFromTwoArrays(int arr1, int arr2) {
        return Math.max(arr1, arr2);
    }
}

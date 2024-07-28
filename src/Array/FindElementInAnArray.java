package Array;

public class FindElementInAnArray {

    public static void main(String[] args) {

        int n = 6;
        int[] arr = new int[]{15, 30, 40, 4, 11, 9, 40};
        int num = 40;

        int element = findElementFromArray(num, arr);
        System.out.println(element);
    }

    public static int findElementFromArray(int num, int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                index = i;
                break;
            }
        }
        return index;
    }
}

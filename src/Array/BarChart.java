package Array;

public class BarChart {

    public static void main(String[] args) {

        int n = 5;
        int[] arr = new int[]{3, 1, 0, 7, 5};

        int max = getMaxFromArray(arr);
        System.out.println();

        for (int floor = max; floor >= 1; floor--) {

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= floor) {
                    System.out.print("*\t");
//                    System.out.print(arr[j]+"*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    private static int getMaxFromArray(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

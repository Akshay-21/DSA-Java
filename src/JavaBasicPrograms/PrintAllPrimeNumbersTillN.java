package JavaBasicPrograms;

public class PrintAllPrimeNumbersTillN {
    public static void main(String[] args) {
        int low = 6;
        int high = 24;

        for (int i = low; i <= high; i++) {
            isPrimeNumber(i);
        }
    }

    private static void isPrimeNumber(int n) {

        int flag = 0;
        int value = 0;

        for (int div = 2; div * div <= n; div++) {
            if (n % div == 0) {
                flag++;
                break;
            } else {
                value = n;
            }
        }

        if (flag == 0) {
            System.out.println("Prime:- " + value);
        }

    }
}

package JavaBasicPrograms;

public class PrintAllFibonacciNumberTillN {

    public static void main(String[] args) {

        int n = 10;
        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}

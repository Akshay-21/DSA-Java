package Pattern;

public class Pattern_12 {
    public static void main(String[] args) {

        int n = 5;
        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a+"\t");
                int temp = a + b;
                a = b;
                b = temp;
            }
            System.out.println();
        }
    }
}

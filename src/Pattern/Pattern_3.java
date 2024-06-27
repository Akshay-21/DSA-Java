package Pattern;

public class Pattern_3 {
    public static void main(String[] args) {

        int n = 5;
        int space = n - 1;
        int st = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }

            for (int k = 1; k <= st; k++) {
                System.out.print("*\t");
            }

            space--;
            st++;
            System.out.println();
        }
    }
}

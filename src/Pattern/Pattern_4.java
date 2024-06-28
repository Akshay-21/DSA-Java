package Pattern;

public class Pattern_4 {

    public static void main(String[] args) {

        int n = 5;
        int st = n;
        int sp = 0;

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < sp; j++) {
                System.out.print("\t");
            }

            for (int k = 1; k <=st; k++) {
                System.out.print("*\t");
            }

            sp++;
            st--;
            System.out.println();
        }
    }
}
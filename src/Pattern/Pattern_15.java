package Pattern;

public class Pattern_15 {

    public static void main(String[] args) {

        int n = 5;
        int sp = n / 2;
        int st = 1;
        int val = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            int cVal = val;

            for (int k = 1; k <= st; k++) {
                System.out.print(cVal + "\t");

                if (k <= st / 2) {
                    cVal++;
                } else {
                    cVal--;
                }
            }

            System.out.println();

            if (i <= n / 2) {
                sp--;
                st += 2;
                val++;
            } else {
                sp++;
                st -= 2;
                val--;
            }
        }
    }
}

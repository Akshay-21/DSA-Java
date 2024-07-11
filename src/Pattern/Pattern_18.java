package Pattern;

public class Pattern_18 {
    public static void main(String[] args) {

        int n = 7;
        int star = n;
        int outerSpace = 0;

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= outerSpace; k++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= star; j++) {

                if (i > 1 && i <= n / 2 && j > 1 && j < star) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }

            if (i <= n / 2) {
                star -= 2;
                outerSpace++;
            } else {
                star += 2;
                outerSpace--;
            }

            System.out.println();
        }
    }
}

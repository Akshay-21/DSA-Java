package Pattern;

public class Pattern_5 {

    public static void main(String[] args) {

        int n = 5;

        int space = n / 2;
        int star = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }

            for (int k = 1; k <= star; k++) {
                System.out.print("*\t");
            }

            System.out.println();

            if (i <= n / 2) {
                space--;
                star = star + 2;
            } else {
                space++;
                star -= 2;
            }
        }
    }
}

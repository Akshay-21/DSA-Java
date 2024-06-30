package Pattern;

public class Pattern_6 {
    public static void main(String[] args) {

        int n = 5;
        int star = (n / 2) + 1;
        int space = 1;
        int st = (n / 2) + 1;

        for (int i = 1; i <= n; i++) {

//			System.out.print(star +", " +space +", "+ st);

            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }

            for (int k = 1; k <= space; k++) {
                System.out.print("\t");
            }

            for (int l = 1; l <= st; l++) {
                System.out.print("*\t");
            }

            if (i <= n / 2) {
                star--;
                space += 2;
                st--;
            } else {
                star++;
                space -= 2;
                st++;
            }

            System.out.println();
        }
    }
}

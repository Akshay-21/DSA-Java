package Pattern;

public class Pattern_17 {
    public static void main(String[] args) {
        int n = 7;

        int space = n / 2;
        int star = 1;

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= space; k++) {

                if (i == (n / 2 + 1)) {
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }

            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }


            if (i <= n / 2) {
                star += 1;
            } else {
                star -= 1;
            }

            System.out.println();
        }
    }
}
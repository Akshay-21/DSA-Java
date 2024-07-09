package Pattern;

public class Pattern_16 {
    public static void main(String[] args) {

        int n = 4;
        int sp = (2*n-3);
        int st = 1;


        for (int i = 1; i <= n; i++) {
            int val = 1;

            for (int j = 1; j <= st; j++) {
                System.out.print(val+"\t");
                val++;
            }

            for (int k = 1; k <= sp; k++) {
                System.out.print("\t");
            }

            if(i == n){
                st--;
                val--;
            }

            for (int l = 1; l <=st ; l++) {
                val--;
                System.out.print(val +"\t");
            }

            st++;
            sp-=2;
            System.out.println();
        }
    }
}
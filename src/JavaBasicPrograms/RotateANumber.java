package JavaBasicPrograms;

public class RotateANumber {

    public static void main(String[] args) {
        int n = 23457; // 72345
        int k = 2;
        int r = 0;
        int i = 1;

        int digits = getDigit(n);
        while (i <= k) {
            int rem = n % 10;
            int q = n / 10;
            r = q + rem * (int) Math.pow(10, digits - 1);
            i++;
            n = r;
        }
        System.out.println(r);
    }

    public static int getDigit(int n) {
        int c = 0;
        while (n != 0) {
            n = n / 10;
            c++;
        }
        return c;
    }
}
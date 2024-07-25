package JavaBasicPrograms;

public class Conv_5_AnyBaseSubtraction {

    public static void main(String[] args) {

        int n1 = 256;
        int n2 = 1212;
        int base1 = 8;

        int finalValue = 0;

        int c = 0;
        int p = 1;
        int d = 0;
        while (n2 > 0) {
            int r1 = n1 % 10;
            int r2 = n2 % 10;

            r2 = r2 + c;

            if (r2 >= r1) {
                c = 0;
                d = r2 - r1;
            } else {
                c = -1;
                d = r2 + base1 - r1;
            }

            n1 = n1 / 10;
            n2 = n2 / 10;

            finalValue = finalValue + d * p;
            p = p * 10;
        }
        System.out.println(finalValue);
    }
}
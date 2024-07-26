package JavaBasicPrograms;

public class Conv_6_AnyBaseMultiplication {

    public static void main(String[] args) {

        int n1 = 234;
        int n2 = 76;
        int b1 = 8;
        int fv = 0;
        int p = 1;

        while (n2 > 0) {
            int d1 = n2 % 10;
            n2 = n2 / 10;
            int prodValue = multiply(b1, d1, n1);
            fv = anyBaseAddition(b1, fv, prodValue * p);
            p = p * 10;
        }

        System.out.println(fv);
    }

    public static int multiply(int b, int n, int n1) {

        int carry = 0;
        int count = 1;
        int finalValue = 0;
        while (n1 > 0 || carry > 0) {
            int d = n1 % 10;
            int prod = (d * n) + carry;
            carry = prod / b;
            int r = prod % b;
            finalValue = finalValue + r * getPower(count);
            count++;
            n1 = n1 / 10;
        }

//        System.out.println(finalValue);
        return finalValue;
    }

    public static int getPower(int n) {
        int p = (int) Math.pow(10, n - 1);
        return p;
    }

    public static int anyBaseAddition(int b1, int n1, int n2) {

        int count = 1;
        int carry = 0;
        int rem;
        int addValues;
        int finalV = 0;

        while (n1 > 0 || n2 > 0 || carry > 0) {
            int r1 = n1 % 10;
            int r2 = n2 % 10;

            addValues = r1 + r2 + carry;
            rem = addValues % b1;
            carry = addValues / b1;
            finalV = finalV + rem * getPower(count);

            n1 = n1 / 10;
            n2 = n2 / 10;
            count++;
        }
//        System.out.println(finalV);
        return finalV;
    }
}
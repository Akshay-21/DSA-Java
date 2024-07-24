package JavaBasicPrograms;

public class Conv_4_AnyBaseAddition {
    public static void main(String[] args) {

        int n1 = 346;
        int n2 = 777;
        int b1 = 8;

        int count = 1;
        int carry = 0;
        int rem;
        int addValues;
        int finalV = 0;

        while (n1 > 0 || n2 > 0 || carry>0) {
            int r1 = n1 % 10;
            int r2 = n2 % 10;

            addValues = r1 + r2 + carry;
            rem = addValues % b1;
            carry = addValues / b1;
            finalV = finalV +  rem * getPower(count);

            n1 = n1 / 10;
            n2 = n2 / 10;
            count++;
        }
        System.out.println(finalV);
    }

    public static int getPower(int n) {
        int p = (int) Math.pow(10, n - 1);
        return p;
    }
}

package JavaBasicPrograms;

public class PythagoreanTriplets {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;
        int c = 4;

        int max = findMax(a, b, c);

        int sqA = getSquareOfNumber(a);
        int sqB = getSquareOfNumber(b);
        int sqC = getSquareOfNumber(c);


        boolean flag;

        if (max == a) {
            flag = (sqB + sqC) == sqA;
        } else if (max == b) {
            flag = (sqC + sqA) == sqB;
        } else {
            flag = ((sqA + sqB) == (sqC));
        }
        System.out.println(flag);
    }

    private static int getSquareOfNumber(int s) {
        int square = 2;
        return (int) Math.pow(s, square);
    }

    private static int findMax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c || b > a) {
            return b;
        } else {
            return c;
        }
    }
}

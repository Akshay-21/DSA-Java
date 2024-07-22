package JavaBasicPrograms;

public class Conv_2_AnyBaseToDecimal {

    public static void main(String[] args) {

        int num = 1172;
        int base1 = 8;
        int base2 = 10;
        int countNum = 0;
        int finalValue = 0;

        while (num != 0) {
            int r = num % base2;
            countNum++;
            finalValue = finalValue + r * getPower(base1, countNum);
            num = num / base2;
        }
        System.out.println();
        System.out.println(finalValue);
    }

    public static int getPower(int baseNum, int n) {
        int r = (int) Math.pow(baseNum, n - 1);
        return r;
    }
}

package JavaBasicPrograms;

import java.util.Scanner;

public class Conv_1_DecimalToAnyBase {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your Number to convert other number system.");
        int n = scn.nextInt();
        System.out.println("Enter Your number to convert the base number");
        int base = scn.nextInt();
        int countNum = 0;
        int pod = 0;

        while (n != 0) {
            int r = n % base;
            countNum++;
            pod = pod + r * getPower(countNum);
            n = n / base;
        }

        System.out.println(pod);
    }

    public static int getPower(int n) {
        int pow = (int) Math.pow(10, n - 1);
        return pow;
    }
}

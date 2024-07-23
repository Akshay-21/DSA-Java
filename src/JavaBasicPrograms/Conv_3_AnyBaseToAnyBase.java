package JavaBasicPrograms;

import java.util.Scanner;

public class Conv_3_AnyBaseToAnyBase {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number to convert with belongs base 1");
        int n = scn.nextInt();
        System.out.println("Enter base number Base1");
        int base1 = scn.nextInt();
        System.out.println("Enter base number to convert the number in Base2");
        int base2 = scn.nextInt();

        int count = 0;
        int finalValue = 0;
        int temp = n;

        int c = 0;
        int result = 0;

        while (n != 0) {
            int r = n % 10;
            count++;
            n = n / 10;
            finalValue = finalValue + r * getPower(base1, count);
        }

        System.out.println(temp + " number with base " + base1 + " conveted into decimal " + finalValue);
        System.out.println();

        int n1 = finalValue;

        while (n1 != 0) {
            int r = n1 % base2;
            c++;
            n1 = n1 / base2;
            result = result + r * getPower(10, c);
        }

        System.out.println("Final conversion into base " + base2 + " " + result);
    }

    public static int getPower(int baseNum, int n) {
        int r = (int) Math.pow(baseNum, n - 1);
        return r;
    }
}

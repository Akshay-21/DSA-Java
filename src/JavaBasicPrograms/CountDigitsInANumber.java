package JavaBasicPrograms;

import java.util.*;

//Count Digits in a Number [L-17]
public class CountDigitsInANumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number for count digit !!");
        int d = scn.nextInt();
//        int a = 65784383;

        int count = 0;
        while (d != 0) {
            int r = d % 10;
            count++;
            d = d / 10;
        }
        System.out.println("Digits in a number - "+count);
    }
}

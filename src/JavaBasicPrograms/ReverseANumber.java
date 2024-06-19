package JavaBasicPrograms;

import java.util.Scanner;

public class ReverseANumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse !");
//        int n = 754;
        int n = 65784383;
//        int n = scn.nextInt();

        while (n != 0) {
            int r = n % 10;
            System.out.print(r + "");
            n = n / 10;
        }
    }
}
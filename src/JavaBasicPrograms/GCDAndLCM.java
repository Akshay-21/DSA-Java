package JavaBasicPrograms;

import java.util.*;

public class GCDAndLCM {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your two number to find GCD and LCM\n");
        System.out.println("Enter Your 1st Number");
        int n1 = scn.nextInt();
        System.out.println("Enter Your 2nd Number");
        int n2 = scn.nextInt();

        int a = 0;  // GCD
        int b = 0;  // LCM

        int onum1 = n1;
        int onum2 = n2;

        while (n1 % n2 !=0){
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }

        int gcd = n2;
        System.out.println("GCD is: "+gcd);

        int lcm = (onum1 * onum2) / gcd;
        System.out.println("LCM is: "+lcm);
    }
}


/*
 *  What will be the first approach
 *
 * brute force we try we start table from 2 till 24 or start table from 24 to till 2 who divides both number that number will be GCD, we observe the reminder who divides both number that will be GCD.
 * Note:- we will not divide by 1 because every number is divisible by 1.
 *
 *
 *
 * */
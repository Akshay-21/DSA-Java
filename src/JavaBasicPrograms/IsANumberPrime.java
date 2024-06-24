package JavaBasicPrograms;

import java.util.*;

public class IsANumberPrime {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
//        int t = scn.nextInt();
    /*    for (int i = 1; i <=t; i++) {
            int n = scn.nextInt();
            isPrime(n);
        }*/

        int n = 9;
        isPrime(n);
    }

    private static void isPrime(int n) {

        int flag = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                flag++;
            }
        }

        if (flag == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

    }


    private static void isPrimeForLargeConstraintsData(int n) {

        int flag = 0;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                flag++;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }



    }

    /*
     * Using above approach we can check weather number is prime or not, but this will do for small numbers.
     * what about for large numbers, t could be t = 10^4 and n could be go up to 10^9 operations.
     * */

    /*
     * Note:-
     * If a number is to be divided then it will be divided up to its square root,
     * if it is not divided up to its square root then it will not be divided even after the square root.
     *
     * then solution is: we don't require to run the loop more than root n.
     * */

    //  To write root n here we use some trick. we will write for loop condition like [i * i <= n]
    // another one is [i <= n/2]
}

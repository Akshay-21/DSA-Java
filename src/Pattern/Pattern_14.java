package Pattern;

import java.util.*;

public class Pattern_14 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number to print multiplication pattern");
        int x = scn.nextInt();
        System.out.println();

        for (int i = 1; i <=10; i++) {
            System.out.println(x + " * " +i +" = "+ i*x);
        }
    }
}

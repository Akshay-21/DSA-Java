package JavaBasicPrograms;

public class InverseOfANumber {

    public static void main(String[] args) {

//  6   5   4   3   2   1
//  4   2   6   1   3   5

//  6   5   4   3   2   1
//  4   1   6   2   5   3

/*
i = 4   1   6   2   5   3
*/

        int n = 426135;
        int count = 0;
        int i = 0;

        while (n != 0) {
            int r = n % 10;
            count++;
            int q = count * (int) Math.pow(10, r - 1);
            i = i + q;
            n = n / 10;
        }

        System.out.println(i);
    }
}

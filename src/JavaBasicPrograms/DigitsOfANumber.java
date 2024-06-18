package JavaBasicPrograms;

public class DigitsOfANumber {

    public static void main(String[] args) {

//        int n = 65784383;
        int n = 754;

        int temp = n;
        int count = 0;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        int q = (int) Math.pow(10, count-1);

        while (q != 0) {
            int q1 = n / q;
            System.out.println(q1);
            n = n % q;
            q = q / 10;
        }
    }
}

/*
* E.g.
* int n = 754
* 7
* 5
* 4
*
*  First count the digits of number.
*  And then make the count digit as hundred. // using int q = Math.pow(10, count -1);
*  after that divide n by 'q'. it will give 7
*
*   again divide n / q to make it reduce unit value and also divide q until it become zero.
**/
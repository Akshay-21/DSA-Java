package JavaBasicPrograms;

public class DigitsFrequency {
    public static void main(String[] args) {

        int n = 994543234;
        int d = 4;
        int frequency =  getDigitFrequency(n, d);
        System.out.println("Frequency of " + d + " in a number "+ n +" is: " + frequency);
    }

    private static int getDigitFrequency(int n, int d) {
        int count = 0;
        while (n != 0) {
            int r = n % 10;
            if (r == d) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }
}

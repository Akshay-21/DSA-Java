package JavaBasicPrograms;

public class BenjaminBulbs {
    public static void main(String[] args) {
        int n = 20;

        /*
        Benjamin Bulbs
        print perfect Square of all numbers which will be less than n.
        */

        for (int i = 1; i * i <= n; i++) {
            System.out.println(i * i);
        }

    }
}

package JavaBasicPrograms;

public class IntroductionToFunctions {

    public static void main(String[] args) {

        int n = 5;
        int r = 2;

        int nFact = fact(n);
        int nmrFact = fact(n - r);
        int npr = nFact / nmrFact;
        display(n, r, npr);
    }

    private static void display(int n, int r, int npr) {
        System.out.println(n + "P" + r + "=" + npr);
    }

    public static int fact(int x) {
        int returnFact = 1;
        for (int i = 1; i <= x; i++) {
            returnFact *= i;
        }
        return returnFact;
    }

}
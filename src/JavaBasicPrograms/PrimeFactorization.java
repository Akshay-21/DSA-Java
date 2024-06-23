package JavaBasicPrograms;

public class PrimeFactorization {

    public static void main(String[] args) {

        int n = 1440;
//        int n = 46;

        /*
        * Prime Number
        * A property of prime number if p.q = n;
        * so, both p and q cannot be together greater than √n.
        * means p>√n and q>√n.
        * */

        /*
        * so using this property we would not execute the divisor beyond the n we execute till √n.
        * we can change this in for loop.
        * for (int div = 2; div * div <= n; div++) {
        *
        * 2nd
        * we can divide n/2, so it will work same as √n.
        * for (int div = 2; div <= n/2; div++) {
        * */

        for (int div = 2; div <= n; div++) {
            while (n % div == 0) {          // n divide by divisor until it is dividing perfectly.
                n = n / div;                // divide n by 'div'/divisor to get new dividend.
                System.out.println(div);
            }
        }
//      O/P:-      2*2*2*2*2*3*3*5 = 1440;

/*      for div = 4 Case: When div becomes 4, it will divide n which gives remainder 1 so, here while loop will stop and increases div value 'div++'.
        then the same n will divide till it gives remainder '0'. (means div will become 5, and n divide perfectly.)
*/


//       Case: if n not equal to 1 print n
        if (n != 1) {
            System.out.println("n:- " + n);
        }
    }
}

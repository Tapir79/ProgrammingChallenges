/*

Factorial 5!
5*4*3*2*1

Factorial 4!
4*3*2*1

 */

package problem10;

public class Problem10Factorial {

    public static void main(String[] args) {
        int factorial = 4;
        int product = 1;

        for (int i = factorial; i > 0; i--) {
            product = product * i;
        }
        System.out.println("Factorial is: " + product);
    }
}

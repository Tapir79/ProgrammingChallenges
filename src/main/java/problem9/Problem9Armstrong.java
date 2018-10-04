/*
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153
 */

package problem9;

public class Problem9Armstrong {

    public static void main(String[] args) {
        int number = 153;
        int original = number;

        // take ONEs
        int ones = number % 10; // 3
        int onesCube = (ones * ones * ones);
        number = number/10;

        int tens = number % 10; // 5
        int tensCube = (tens * tens * tens);
        number = number/10;

        int hundreds = number % 10; // 1
        int hundredsCube = (hundreds * hundreds * hundreds);

        int armstrong = onesCube + tensCube + hundredsCube;
        System.out.println(armstrong);

        if (armstrong == original) {

            System.out.println("Armstrong");
        } else {
            System.out.println("NOT");
        }

    }


}
